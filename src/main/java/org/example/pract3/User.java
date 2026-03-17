package org.example.pract3;

/**
 * Represents a user in the system.
 */
public class User {
    /** The name of the user */
    private String name;
    private String email;

    /**
     * Constructs a new User with the specified name.
     *
     * @param name the name of the user
     */
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Returns the name of the user.
     *
     * @return the user's name
     */
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Returns a string representation of the user.
     *
     * @return a string in the format "User{name='name'}"
     */
    @Override
    public String toString() {
        return "User{" + "name='" + name + "}" + " | email: " + email;
    }
}
