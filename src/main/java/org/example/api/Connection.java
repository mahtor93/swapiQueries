package org.example.api;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public abstract class Connection {
    static String uri = "https://swapi.dev/api";
    private static HttpClient client = HttpClient.newHttpClient();
    private static HttpRequest requestQuery(String query, String addr){
        return HttpRequest.newBuilder()
                .uri(URI.create(
                        String.format("%s/%s%s",uri, addr, queryFormatter(query))
                ))
                .build();
    }
    private static String queryFormatter(String query){
        return query.replace(" ","+");
    }
    public static HttpResponse<String> getInfo(String consulta, String direccion) throws IOException {
        try {
            return client.send(requestQuery(consulta, direccion), HttpResponse.BodyHandlers.ofString());
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
            return null;
        }
    }
}
