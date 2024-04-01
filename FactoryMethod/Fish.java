// class for the Fish dome

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Fish implements Zoo
    {
    public void visit()
        {
        System.out.println("Taking you to the Fish Dome....");
        System.out.println("   ");

        // created a BufferedReader to create a FileReader to read the Fish.txt file.
        try(BufferedReader br1 = new BufferedReader(new FileReader("FactoryMethod//Fish.txt")))
            {
            String Fish;// this is going to be where the Elephant art is stored.
            while((Fish = br1.readLine()) != null)// while there are still characters to be read...
                {
                System.out.println(Fish);// outputs the String.
                }
            } catch (IOException e)
                {
                e.printStackTrace();
                }
        }
    }