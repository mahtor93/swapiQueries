package org.example.userInterface;

import org.example.file.Saver;
import org.example.models.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.example.api.Search.getSearch;

public class LoopMenus {

    private static final ArrayList<Entity> savedElements = new ArrayList<>();

    public static boolean showMainMenu(Scanner sc) throws IOException {
        System.out.println("\nSeleccione una acción");
        System.out.println("a) Buscar elemento");
        System.out.println("b) listar búsquedas");
        System.out.println("c) Guardar búsquedas en un Documento");
        System.out.println("d) Salir");
        char opt = sc.nextLine().charAt(0);

        switch(opt){
            case 'a' -> {
                MenuRes schema = showClassOptions(sc);
                if(schema.getRoute().equals("g")){
                    break;
                }
                System.out.println("Ingrese su búsqueda:");
                String userSearch = sc.nextLine();
                Entity resp = getSearch(userSearch, schema);
                savedElements.add(resp);
                System.out.printf("Guardando %s\n", resp.getName());
            }
            case 'b' -> {
                System.out.println("Listando ... ");
                for(Entity e: savedElements){
                    System.out.println(e.getName()+"\n");
                }
            }
            case 'c' -> {
                System.out.println("Ingresa un nombre de archivo:");
                String savedName = sc.nextLine();
                Saver.saver(savedElements, savedName);
                System.out.printf("\nGuardado en %s.json\n",savedName);
            }
            case 'd' -> System.out.println("Saliendo");
        }
        return(opt!='d');
    }

    public static MenuRes showClassOptions(Scanner sc) {
        System.out.println("\nSeleccione una opción de búsqueda:");
        System.out.println("a) Buscar Personaje");
        System.out.println("b) Buscar Nave");
        System.out.println("c) Buscar Planeta");
        System.out.println("d) Buscar Vehículo");
        System.out.println("e) Buscar Especie");
        System.out.println("f) Buscar Película");
        System.out.println("g) Salir");
        MenuRes res = new MenuRes();
        char opt = sc.nextLine().charAt(0);
        switch (opt) {
            case 'a':
                res.setClase(People.class);
                res.setRoute("people/");
                break;
            case 'b':
                res.setClase(Starship.class);
                res.setRoute("starships/");
                break;
            case 'c':
                res.setClase(Planet.class);
                res.setRoute("planets/");
                break;
            case 'd':
                res.setClase(Vehicle.class);
                res.setRoute("vehicles/");
                break;
            case 'e':
                res.setClase(Specie.class);
                res.setRoute("species/");
                break;
            case 'f':
                res.setClase(Film.class);
                res.setRoute("films/");
                break;
            case 'g':
                res.setClase(null);
                res.setRoute("g");
                break;
        }
        return res;
    }





}
