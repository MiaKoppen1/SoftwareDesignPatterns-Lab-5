// class for the Penguin enclosure

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Penguin implements Zoo
    {
    public void visit()
        {
        System.out.println("Taking you to the Penguin enclosure....");
        System.out.println("  ");// space between next line.
      

        // created a BufferedReader to create a FileReader to read the Elephant.txt file.
        try(BufferedReader br1 = new BufferedReader(new FileReader("FactoryMethod//Penguin.txt")))
            {
            String Penguin;// this is going to be where the Elephant art is stored.
            while((Penguin = br1.readLine()) != null)// while there are still characters to be read...
                {
                System.out.println(Penguin);// outputs the String.
                }
            } catch (IOException e)
                {
                e.printStackTrace();
                }
        }
    }