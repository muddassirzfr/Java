/**
 * Name: Jacob Ward
 * Course: CSE 110
 * Lab Section: Section B
 * Date: April 28, 2013
 * Assignment: Programming Project 7 - Porcupine.java
 * Description: This class creates a "Bee" creature that stings from behind while flying around randomly creating "hives"
 *
 * <Insert at least a paragraph here going over your rationale
 * for implementing the critter in the way that you did.>
 */

// Change MyCritter to whatever name that you come up with
// for your critter. Don't forget to rename the file as well.
public class Porcupine implements Critter
{
	public char getChar()
	{
		return '*';
	}

	public Move getMove(Neighbor front, Neighbor back, Neighbor left, Neighbor right)
	{
		if (back == Neighbor.OTHER || front == Neighbor.OTHER || left == Neighbor.OTHER || right == Neighbor.OTHER)
		{
			return Move.INFECT;
		}

		else if (Math.random() < .5)
		{
			if (Math.random() < .5)
			{
				return Move.LEFT;
			}

			else
			{
				return Move.RIGHT;
			}
		}

		else
		{
			return Move.HOP;
		}
	}
}