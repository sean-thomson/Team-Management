package main;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class TeamManager {

    public static void main(String[] args)
    {
        String city = JOptionPane.showInputDialog("Input team's city");
        String teamName = JOptionPane.showInputDialog("Input team name");

        Team currentTeam = new Team (city, teamName);
    }
}
