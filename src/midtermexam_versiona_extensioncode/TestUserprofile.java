/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author aryan
 */

import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting the user for name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // List of possible genres
        System.out.println("Favorite genres:");
        System.out.println("1. Sci-Fi");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Action");
        System.out.println("5. Horror");

        // Prompting the user for favorite genres
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int choice = input.nextInt();

        String favGenre;

        // Determine the genre based on the user's choice
        switch (choice) {
            case 1:
                favGenre = "Sci-Fi";
                break;
            case 2:
                favGenre = "Comedy";
                break;
            case 3:
                favGenre = "Drama";
                break;
            case 4:
                favGenre = "Action";
                break;
            case 5:
                favGenre = "Horror";
                break;
            default:
                favGenre = "Unknown";
                break;
        }

        // Creating the user profile message
        String profile = "User Profile\n" +
                "Name: " + name + "\n" +
                "Favorite Genre: " + favGenre;

        // Displaying the user profile message
        System.out.println("\n" + profile);
    }
}
