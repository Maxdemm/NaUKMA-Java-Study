package org.example.pract3;

import org.example.pract3.UserRepository;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

/**
 * Main class demonstrating the usage of UserRepository.
 * Shows examples of handling Optional:
 * Using orElseGet to provide a default user.
 * Using orElseThrow to throw an exception.
 */
public class UserRepositoryMain {
    /**
     * Entry point of the application.
     * Demonstrates how to retrieve users and handle missing users with Optional.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRepository ur = new UserRepository();

        User user1 = ur.findByEmail(scanner.nextLine()).orElseGet(() -> new User("guest", ur.createNewEmail()));
        System.out.println("welcome " + user1.getName() + " | your email: " + user1.getEmail());

    }
}
