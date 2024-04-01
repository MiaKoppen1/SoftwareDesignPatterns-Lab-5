// class for the Elephant enclosure

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Elephant implements Zoo
    {
    public void visit()
        {
        System.out.println("Taking you to the Elephant enclosure....");
        System.out.println("   ");

// created a BufferedReader to create a FileReader to read the Elephant.txt file.
        try(BufferedReader br1 = new BufferedReader(new FileReader("FactoryMethod//Elephant.txt")))
            {
            String Elephant;// this is going to be where the Elephant art is stored.
            while((Elephant = br1.readLine()) != null)// while there are still characters to be read...
                {
                System.out.println(Elephant);// outputs the String.
                }
            } catch (IOException e)
                {
                e.printStackTrace();
                }
        }
    }