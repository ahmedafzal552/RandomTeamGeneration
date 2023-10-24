/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package randomteamgeneration;

/**
 *
 * @author ahmed
 */
public class People {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public People(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + getFullName() + ", Email: " + email;
    }
}
