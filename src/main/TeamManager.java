package main;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class TeamManager {

    public static void main(String[] args) {
        String city;
        do {
            city = JOptionPane.showInputDialog("Input team's city");
            if (city == null)
                return;
        } while (city.trim().isEmpty());

        String teamName;
        do {
            teamName = JOptionPane.showInputDialog("Input team name");
            if (teamName == null)
                return;
        } while (teamName.trim().isEmpty());

        Team currentTeam = new Team(city, teamName);

        int choice = 0;
        String[] options = {"Add a player", "Get a player's stats", "View roster"};

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

            if (choice == 2)
            {
                currentTeam.printRoster();
            }
        }
    }
}
