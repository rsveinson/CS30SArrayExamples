import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Random;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Simple array examples
 * 
 *  Description:    some examples of using arrays
 * 
 *************************************************************/

public class CS30SSimpleArrayExamples {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // array variables
        int[] list = new int[10];       // and array with max size 10
        
        int n = 0;          // number read from the keyboard
        int count = 0;      // index and array entry counter
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
    
        Random random = new Random();   
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Simple Array Examples" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    // ***** Main Processing *****
        
        // load the list with random numbers
        //System.out.println("loading list with random numbers." + nl);
        // for(int i = 0; i < list.length; i++){
            // list[i] = random.nextInt(6);
        // }// end load list
        
        // load list from the keyboard
        // pre-loop condition
        count = 0;
        
        System.out.println("Enter numbers for the list, enter 0 to stop");
        n = scanner.nextInt();
    
        while(n != 0 && count < list.length){
            list[count++] = n;
            
            //count++;
            
            n = scanner.nextInt();
        }// end while
        
        // printing the array variable doesn't do what i expected
        System.out.println(list);
        
        // print the list
        System.out.println("The list of random numbers: ");
        for(int i = 0; i < count; i++){
            System.out.println(list[i]);
        }// end for int i
    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
