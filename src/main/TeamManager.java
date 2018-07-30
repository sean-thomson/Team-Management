package main;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class TeamManager {

    public static void main(String[] args) {
        String city = JOptionPane.showInputDialog("Input team's city");

        String teamName = JOptionPane.showInputDialog("Input team name");

        Team currentTeam = new Team(city, teamName);

        int choice = 0;
        String[] options = {"Add a player", "Get a player's stats"};

        while (choice != -1)
        {
            choice = JOptionPane.showOptionDialog(null, "Manage the " + currentTeam.fullTeamName + ":", currentTeam.fullTeamName + " Team Manager", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (choice == 0)
            {
                currentTeam.addPlayer();
            }

            if (choice == 1)
            {
                currentTeam.getStats();
            }
        }
    }
}
