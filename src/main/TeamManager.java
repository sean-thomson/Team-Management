package main;
import jdk.nashorn.internal.scripts.JO;
import javax.swing.JOptionPane;
import java.awt.*;
import java.io.*;

public class TeamManager {

    public static void main(String[] args) {
        String[] loadOrNew = {"New", "Load"};
        int fileChoice = JOptionPane.showOptionDialog(null, "Start a new team or load previous team", "Team Manager", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, loadOrNew, loadOrNew[0]);
        Team currentTeam;

        if (fileChoice == 1) {
            FileDialog dialogBox = new FileDialog((Frame)null, "Select .ser file to open");
            dialogBox.setMode(FileDialog.LOAD);
            dialogBox.setVisible(true);
            String fileString = dialogBox.getFile();

            try {
                FileInputStream loadFile = new FileInputStream(fileString);
                ObjectInputStream in = new ObjectInputStream(loadFile);
                currentTeam = (Team) in.readObject();
                in.close();
                loadFile.close();
            } catch (IOException exc) {
                exc.printStackTrace();
                return;
            } catch (ClassNotFoundException clExc) {
                System.out.println("Class not found");
                clExc.printStackTrace();
                return;
            }
        }
        else {
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

            currentTeam = new Team(city, teamName);
        }
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

        try {
            File newFile = new File (currentTeam.fullTeamName + ".ser").getAbsoluteFile();
            FileOutputStream file = new FileOutputStream(currentTeam.fullTeamName + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(currentTeam);
            out.close();
            file.close();
            System.out.println("Team data saved in " + currentTeam.fullTeamName + ".ser");
            return;
        } catch(IOException exc) {
            exc.printStackTrace();
        }
    }
}
