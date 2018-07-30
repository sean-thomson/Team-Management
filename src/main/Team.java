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

        String[] positions = {"PG", "SG", "SF", "PF", "C"};
        String playerPos = (String) JOptionPane.showInputDialog(null, "Choose player's position", "Player Position", JOptionPane.QUESTION_MESSAGE, null, positions, positions[0]);

        String pointsString = JOptionPane.showInputDialog("Input player's points per game");
        double points = Double.parseDouble(pointsString);

        String assistsString = JOptionPane.showInputDialog("Input player's assists per game");
        double assists = Double.parseDouble(assistsString);

        String reboundsString = JOptionPane.showInputDialog("Input player's rebounds per game");
        double rebounds = Double.parseDouble(reboundsString);

        String blocksString = JOptionPane.showInputDialog("Input player's blocks per game");
        double blocks = Double.parseDouble(blocksString);

        Player newPlayer = new Player (firstName, lastName, playerPos, points, assists, rebounds, blocks);
        roster.add(newPlayer);
    }

    public void printRoster()
    {
        for (int i = 0; i < roster.size(); i++)
        {
            System.out.println(roster.get(i).position + " " + roster.get(i).firstName + " " + roster.get(i).lastName);
        }
    }

    public void getStats()
    {
        String firstName = JOptionPane.showInputDialog("Input player's first name");

        String lastName = JOptionPane.showInputDialog("Input player's last name");

        System.out.println(firstName + ' ' + lastName);
        if (getPlayerPointsPerGame(firstName, lastName) != -1)
        {
            System.out.println("PPG: " + getPlayerPointsPerGame(firstName, lastName));
            System.out.println("APG: " + getPlayerAssistsPerGame(firstName, lastName));
            System.out.println("RPG: " + getPlayerReboundsPerGame(firstName, lastName));
            System.out.println("BPG: " + getPlayerBlocksPerGame(firstName, lastName));
        }
        else
        {
            System.out.println("Player not found");
        }
    }

    public double getPlayerPointsPerGame(String firstName, String lastName)
    {
        for (int i =  0; i < roster.size(); i++)
        {
            if (roster.get(i).firstName.equals(firstName) && roster.get(i).lastName.equals(lastName))
            {
                return roster.get(i).getPointsPerGame();
            }
        }
        return -1;
    }

    public double getPlayerAssistsPerGame(String firstName, String lastName)
    {
        for (int i =  0; i < roster.size(); i++)
        {
            if (roster.get(i).firstName.equals(firstName) && roster.get(i).lastName.equals(lastName))
            {
                return roster.get(i).getAssistsPerGame();
            }
        }
        return -1;
    }

    public double getPlayerReboundsPerGame(String firstName, String lastName)
    {
        for (int i =  0; i < roster.size(); i++)
        {
            if (roster.get(i).firstName.equals(firstName) && roster.get(i).lastName.equals(lastName))
            {
                return roster.get(i).getReboundsPerGame();
            }
        }
        return -1;
    }

    public double getPlayerBlocksPerGame(String firstName, String lastName)
    {
        for (int i =  0; i < roster.size(); i++)
        {
            if (roster.get(i).firstName.equals(firstName) && roster.get(i).lastName.equals(lastName))
            {
                return roster.get(i).getBlocksPerGame();
            }
        }
        return -1;
    }

}
