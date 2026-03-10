package org.example.pract3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Repository for managing users.
 * Provides methods to find users by email.
 */
public class UserRepository {

    ArrayList<User> users = new ArrayList<>();
    public UserRepository() {
        users.add(new User("Admin", "admin@example.com"));
        users.add(new User("Ivan", "user@example.com"));
        users.add(new User("Ivan", "guest1@gmail.com"));
        users.add(new User("Ivan", "guest2@gmail.com"));
        users.add(new User("Ivan", "guest3@gmail.com"));
    }

    /**
     * Finds a user by their email address.
     *
     * @param email the email of the user
     * @return an Optional containing the user if found,
     *         or an empty Optional if no user with the given email exists
     */
    public Optional<User> findByEmail(String email) {
        for (User u: users) {
            if (u.getEmail().equalsIgnoreCase(email))
                return Optional.of(u);
        }
        return Optional.empty();
    }


    public String createNewEmail() {
        int i = 1;

        while(true) {
            boolean emailPresent = false;
            String email = "guest" + i + "@gmail.com";

            for (User user: users) {
                if (user.getEmail().equalsIgnoreCase(email)) {
                    emailPresent = true;
                    break;
                }
            }

            if (!emailPresent)
                return email;

            i++;
        }

    }
}
