
package datachecking;

/**
 *Justin Piel
 * Period 3
 * @author 18275\
 * 
 *  Answer the following:
    1. What replaces System.in to read from a file instead of the console?
    * the name of the file you want to read.
    2. What code determines if there are more lines in the file to read?
    * file.hasNext()
    3. What code allows reading in a String? a double? an int?
    * file.nextLine(), file.nextDouble(), file.nextInt().
    4. What does file.hasNextDouble() allow us to test?
    * if the file has a double.
 */
import java.io.File;
import java.util.Scanner;
public class DataChecking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner file = null;
        try {
            //sampledata.txt must be stored in the same folder as 
            //ErrorChecking.class for this next line to work
            file = new Scanner(new File("sampledata.txt"));

            while(file.hasNext()) //while there's another line to read
            {
                String line  = file.nextLine();
                //ERROR ALERT: This next line is incorrect and we will need
                //             to figure out why and correct it.
                System.out.println(file.nextLine()); 
            }
            while(file.hasNext()){
                if(!file.hasNextDouble())
                {
                    String line2 = file.nextLine();
                    System.out.println(line2);
                }
                    }
        }
        catch (Exception e)
        {
            //print out the exception if there is one for debugging
            System.out.println(e);
        }
    }
    }
    

