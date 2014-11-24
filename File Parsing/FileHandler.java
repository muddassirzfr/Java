/*
*Description: This class takes a document, with commas inbetween the words and reformats it with spaces, then it sends it to a new .txt file
*/

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FileHandler
{

	/*
	 *This method takes one file's texts, replaces commas with spaces, and saves the new format in a different text file
	 *
	 *@param <inputFileName> this string variable directs the method to the first text to be opened and read
	 *@param <outPutFileName> This string variable directs the method to the text that the new format will be stored in.
	 */

	public void copyFile(String inputFileName, String outputFileName)
	{
		try
		{
			File f = new File(inputFileName);
			Scanner scan = new Scanner(f);

			PrintWriter out = new PrintWriter(outputFileName);

			while (scan.hasNextLine())
			{
				String line = scan.nextLine();
				String [] words = line.split(",");

				for (int i = 0; i < words.length; i++)
				{
					out.print(words[i]);
					out.print(" ");

				}

				out.println("");
			}

			out.close();
		}

		catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
