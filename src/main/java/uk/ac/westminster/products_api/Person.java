package uk.ac.westminster.products_api;

/**
 * Week 1 starter class.
 *
 * Already provided:
 *   - a private "name" field
 *   - a no-argument constructor (required by Jackson later in the module)
 *   - a full constructor
 *   - a getter and setter for "name"
 *
 * TODO (Lab Activity 3):
 *   Add a new private String field called "email", following the
 *   JavaBean convention: provide a getter called getEmail().
 */
public class Person {
    private String name;
    private String email; // Added email field

    // Existing constructor, getters, and setters for name...

    // New getter following the JavaBean convention
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

    // TODO (Activity 3): add the "email" field and its getter here.

