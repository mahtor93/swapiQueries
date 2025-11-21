package org.example;
import java.io.IOException;
import java.util.Scanner;
import static org.example.userInterface.LoopMenus.showMainMenu;

public class Main {
    public static void main(String[] args) throws IOException {
        Boolean exit = false;
        Scanner sc = new Scanner(System.in);

        try {
            while(!exit){
                    exit=!showMainMenu(sc);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}