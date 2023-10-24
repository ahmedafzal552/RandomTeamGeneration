/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package randomteamgeneration;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmed
 */
public class Team {
    private String name;
    private List<People> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addMember(People person) {
        members.add(person);
    }

    public String getName() {
        return name;
    }

    public List<People> getMembers() {
        return members;
    }
}
