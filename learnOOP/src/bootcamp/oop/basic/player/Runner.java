package bootcamp.oop.basic.player;

import java.util.Random;

public class Runner 
{
	public static void printPlayer() 
    {
        for (int i = 0; i < numPlayers; i++) 
        {
            System.out.print("Player " + (i + 1) + " ");
            players[i].printPlayer();
        }
    }

    public static void removePlayer(Player player) 
    {
        int save_index = 0;
        for (int i = 0; i < numPlayers; i++) 
        {
            if (player == players[i]) 
            {
                save_index = i;
                for (int j = i; j < numPlayers - 1; j++) 
                {
                    players[j] = players[i + 1];
                }
            }
        }
        System.out.println("Player " + (save_index + 1) + " is removed.");
        numPlayers--;
    }

    public static void addPlayer(Player player) 
    {
        numPlayers++;
        Player[] newPlayers = new Player[numPlayers];
        for (int i = 0; i < numPlayers-1; i++) {
            newPlayers[i] = players[i];
        }
        newPlayers[numPlayers - 1] = player;
        players = newPlayers;
    }
	
    public static int totalPoints = 0; //default value
    public static int numPlayers = 1; //min value
    public static Player[] players; //Array of the whole players in the game.

    public static void main(String[] args) 
    {
        players = new Player[numPlayers]; // the first player.
        for (int i = 0; i < numPlayers; i++) 
        {
            players[i] = new Player();
        }
        printPlayer();
        System.out.println();
        
        Player onePlayer = new Player();
        addPlayer(onePlayer);
        printPlayer();
        System.out.println();
        
        Random rand = new Random();
        int saveRandom;
        for (int i = 0; i < 3; i++) 
        {
            saveRandom = rand.nextInt(numPlayers);
            System.out.print("Player " + (saveRandom + 1) + " ");
            players[saveRandom].eatBonus();
            saveRandom = rand.nextInt(numPlayers);
            System.out.print("Player " + (saveRandom + 1) + " ");
            players[saveRandom].hitObstacle();
        }
        System.out.println();
        printPlayer();
    }
}
