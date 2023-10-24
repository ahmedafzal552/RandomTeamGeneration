/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomteamgeneration;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


// Click https://github.com/ahmedafzal552/RandomTeamGeneration  Github Repo Link..
/**
 *
 * @author ahmed
 */
public class RandomTeamGeneration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<People> people = readDataFromFile("MOCK_DATA.csv");
        if (people.size() < 100) {
            System.out.println("Error: Insufficient data to create teams.");
            return;
        }
        List<Team> teams = createTeams(people);
        printTeams(teams);
    }

    private static List<People> readDataFromFile(String filename){
        List<People> people = new ArrayList<>();

        String myFileName = "MOCK_DATA.csv";
        
        try{
          //must have a try-catch because the file might not exist
          Scanner myFile = new Scanner(new FileReader(myFileName));
          
          //use .hasNext() to check to see if there is anything in the file. True/False.
          /*
            while loop is best here because the file might be empty
          
          */
          while (myFile.hasNext()){
              
              //there is something in the file. Let's see what it is!
              String input = myFile.nextLine(); //reads a line fromt the file
              //System.out.println(input);
              String line;
              int id = 1;
              while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 4) {
                        people.add(new Person(id, parts[1], parts[2], parts[3]));
                        id++;
          }
          System.out.println("Finished reading from file");
          
      }catch (Exception e){
          //error opening file
          System.out.println("Error - unable to find file " + myFileName);
      }
        return people;
    }

    private static List<Team> createTeams(List<People> people) {
        List<Team> teams = new ArrayList<>();
        List<People> shuffledPeople = new ArrayList<>(people);
        Collections.shuffle(shuffledPeople);

        for (int i = 1; i <= 20; i++) {
            Team team = new Team("Team " + i);
            for (int j = 0; j < 5; j++) {
                if (!shuffledPeople.isEmpty()) {
                    team.addMember(shuffledPeople.remove(0));
                }
            }
            teams.add(team);
        }

        return teams;
    }

    private static void printTeams(List<Team> teams) {
        for (Team team : teams) {
            System.out.println("Team Name: " + team.getName());
            System.out.println("Members:");
            for (People person : team.getMembers()) {
                System.out.println(person.toString());
            }
            System.out.println();
        }
    }
}
