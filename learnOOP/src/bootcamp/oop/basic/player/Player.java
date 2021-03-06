package bootcamp.oop.basic.player;

import java.util.Random;

public class Player 
{
	private int points = 0; //default value
	private int lives = 3;  //default value

	public Player() {
		
	}

	//method					
	public void eatBonus()  //add points
	{
		Random rand = new Random();
		int numBouns = rand.nextBoolean() ? 100 : 150;
		System.out.println("Yeah! you Gained "+numBouns+" points");
		addPoints(numBouns);
		Runner.totalPoints+=numBouns; 
	}
		
	public void hitObstacle()  //subtracts points
	{
		Random rand = new Random();
		int numMinus = rand.nextBoolean() ? 100 : 200;
		System.out.println("Ohps! you lost "+numMinus+" points");
		subtractPoints(numMinus);
		Runner.totalPoints-=numMinus;
	}
		
		private void addPoints(int numPoints) 
		{
			points+=numPoints;
			if(points>=150)
			{
				if(lives < 3) {
				lives++;
				points-=150;
				}
				else {
				points = 150;
			         }
			}
		}
		
		private void subtractPoints(int numPoints) {
	        points -= numPoints;
	        while (points < 0)
	        {
	            if (points <= 0)
	            {
	                lives--;
	                if (lives == 0)
	                {
	                    Runner.removePlayer(this);
	                    return;
	                }
	                points += 150;
	            }
	        }
	    }
		
		public void printPlayer() 
		{
	        System.out.println("has " + points + " points, and " + lives + " lives.");
	    }	
}
