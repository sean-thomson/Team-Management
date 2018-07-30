package main;

public class Player {
    String firstName;
    String lastName;
    private double pointsPerGame;
    private double assistsPerGame;
    private double reboundsPerGame;
    private double blocksPerGame;

    public Player (String first, String last, double points, double assists, double rebounds, double blocks)
    {
        firstName = first;
        lastName = last;
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
