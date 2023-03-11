package com.example.pacman;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;


public class Fil {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File ("pac-man.txt");
        Scanner input = new Scanner(file);

        try {
            input = new Scanner(new File("pac-man.txt"));
        } catch (Exception ex) {
            System.out.println("Can not open file.");
            System.exit(0);

        }
        int bredde = input.nextInt();
        int høyde = input.nextInt();
        System.out.println("" + bredde + " " + høyde);

        // char [][] tegn = new char[rad][kolonne];
        // System.out.println(tegn);

        while (input.hasNextLine()) {
            String data = input.nextLine();
            System.out.println(data);
        }
        if (file.exists()) {
            System.out.println("JA");
        } else {
            System.out.println("NEI");
        }
    }
}
