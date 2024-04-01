// class for the Tiger enclosure

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tiger implements Zoo
    {
    public void visit()
        {
        System.out.println("Taking you to the Tiger enclosure....");
        System.out.println("   ");

        // created a BufferedReader to create a FileReader to read the Elephant.txt file.
        try(BufferedReader br1 = new BufferedReader(new FileReader("FactoryMethod//Tiger.txt")))
            {
            String Tiger;// this is going to be where the Elephant art is stored.
            while((Tiger = br1.readLine()) != null)// while there are still characters to be read...
                {
                System.out.println(Tiger);// outputs the String.
                }
            } catch (IOException e)
                {
                e.printStackTrace();
                }
        }
    }