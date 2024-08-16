/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.marketplazasystem;

/**
 *
 * @author USER
 */
import java.util.Scanner;

//create lectureRoom class
class LectureRoom {
    private int students;
    private final boolean[] lights;

    public LectureRoom() {
        students = 0;
        lights = new boolean[3]; // Initialize 3 lights, all off
    }

    // adding students
    public void addStudents(int number) {
        students += number;
        
        System.out.println(number + " students added. Total students: " + students);
    }

    // removing students
    public void removeStudents(int number) {
        if (number > students) {
            students = 0;
        
        } else {
            students -= number;
        }
        System.out.println(number + " students removed. Total students: " + students);
    }

    // Method to turn on a light
    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = true;
            System.out.println("Light " + lightNumber + " turned on.");
        } else {
            
            System.out.println("Invalid light number!");
        }
    }

    // Method for turning off lights
    public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = false;
            System.out.println("Light " + lightNumber + " turned off.");
        } else {
            System.out.println("Invalid light number!");
        }
    }
}

//Calculation logic
public class MarketPlazaSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LectureRoom room = new LectureRoom();

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("W: Add Students to Room");
            System.out.println("X: Remove Students from Room");
            System.out.println("Y: Turn On a Light");
            System.out.println("Z: Turn Off a Light");
            System.out.println("Q: Quit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "W" -> {
                    System.out.print("Enter the number of students to add: ");
                    int addCount = scanner.nextInt();
                    scanner.nextLine(); //newline
                    room.addStudents(addCount);
                }
                case "X" -> {
                    System.out.print("Enter the number of students to remove: ");
                    int removeCount = scanner.nextInt();
                    scanner.nextLine(); //newline
                    room.removeStudents(removeCount);
                }
                case "Y" -> {
                    System.out.print("Enter the light number to turn on (1, 2, or 3): ");
                    int lightOnNumber = scanner.nextInt();
                    scanner.nextLine(); //newline
                    room.turnOnLight(lightOnNumber);
                }
                case "Z" -> {
                    System.out.print("Enter the light number to turn off (1, 2, or 3): ");
                    int lightOffNumber = scanner.nextInt();
                    scanner.nextLine(); //newline
                    room.turnOffLight(lightOffNumber);
                }
                case "Q" -> {
                    System.out.println("Quitting program.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option! Please choose a valid menu item.");
            }
        }
    }
}

