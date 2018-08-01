package main;

import java.io.Serializable;

public class Player implements Serializable {
    String firstName;
    String lastName;
    String position;
    private double pointsPerGame;
    private double assistsPerGame;
    private double reboundsPerGame;
    private double blocksPerGame;

    public Player (String first, String last, String pos, double points, double assists, double rebounds, double blocks)
    {
        firstName = first;
        lastName = last;
        position = pos;
        pointsPerGame = points;
        assistsPerGame = assists;
        reboundsPerGame = rebounds;
        blocksPerGame = blocks;
    }

    public double getPointsPerGame()
    {
        return pointsPerGame;
    }

    public double getAssistsPerGame()
    {
        return assistsPerGame;
    }

    public double getReboundsPerGame()
    {
        return reboundsPerGame;
    }

    public double getBlocksPerGame()
    {
        return blocksPerGame;
    }

}
