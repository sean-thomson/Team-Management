package main;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Team {

    public String fullTeamName;
    List<Player> roster;

    public Team (String city, String team)
    {
        fullTeamName = city + ' ' + team;
        roster = new ArrayList<>();
    }

    public void addPlayer()
    {
        String firstName = JOptionPane.showInputDialog("Input player's first name");
        String lastName = JOptionPane.showInputDialog("Input player's last name");
        double points = Integer.parseInt(JOptionPane.showInputDialog("Input player's points per game"));
        double assists = Integer.parseInt(JOptionPane.showInputDialog("Input player's assists per game"));
        double rebounds = Integer.parseInt(JOptionPane.showInputDialog("Input player's rebounds per game"));
        double blocks = Integer.parseInt(JOptionPane.showInputDialog("Input player's blocks per game"));
        Player newPlayer = new Player (firstName, lastName, points, assists, rebounds, blocks);
        roster.add(newPlayer);
    }

    public double getPlayerPointsPerGame(String firstName, String lastName)
    {
    }
}
