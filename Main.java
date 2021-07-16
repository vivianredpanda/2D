import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.util.Arrays;
import java.io.FileNotFoundException;  
import java.util.Scanner; 
import java.io.File; 

class Main {
  public static void main(String[] args) throws FileNotFoundException{
    
    // Create a 2D String array called 'citizenData' with 3 rows and 9 columns to hold the Gender Ratio Data
    double[][] citizenData = new double[3][9];

    // Reads each line of the text file containing data about gender ratios
    Scanner myReader = new Scanner(new File("GenderRatiosFor2DArrays.txt"));

    // Create two variables , rownum and colnum, to hold place values for rows and columns


    // Add each piece of data from the text file into the 2d array 'citizenData'
    while (myReader.hasNextDouble()) {
      citizenData[][] = myReader.nextDouble();
      // Change rownum and colnum so that data is read from left to right into each row within the 2D array
      //**hint rownum should stay the same until colnum is at the end of the row, and then they should move to the beginning of the second row
     
    }

    // Closes the Scanner
    myReader.close();
    //Use Arrays.deepToString(arr) to make sure your data has entered the array correctly
  

   // Create a 2D String array called 'ageRange' with 9 rows and 2 columns with each row representing the min and max number of each range

    // Reads each line of the text file containing data about age ranges
    myReader = new Scanner(new File("AgeRangesFor2D.txt"));

    // Set variables to hold place values for rows and columns


    // Add each piece of data from the text fileinto the 2d array 'ageRange'
    //Iterate the same way as for the Citizen Data, note that you would use Int instead of Double



    // Closes the Scanner
    myReader.close();
    // Use Arrays.deepToString(arr) to help print out the 2D array if needed

    
  // Creates a 1D String array called rowNames with a length of 4 and adds each rowname from the textfile into the array
    String[] rowNames = new String[4];
    myReader = new Scanner(new File("RowNamesFor2DArrays.txt"));
    int row = 0;
    while (myReader.hasNextLine()) {
      rowNames[row] = myReader.nextLine();
      row++;
    }
    myReader.close();
    System.out.println(Arrays.deepToString(rowNames));

    // Printing out the table
    //Print out a new line and then the first label in rowNames
 
    //Print out all of the values in ageRange by combining the values in each row with a "-" **remember the first value in each of the rows is the minimum and the second value is the maximum of the range
    //Remember to format each String with the addFormatting method in StudyingData.java ** set the length to be 7


    //Print out a new line for formatting


    //Print out the rest of the table with the rowNames corresponding to each portion of data in citizenData ** set rowNames formatting to 25 and citizenData formatting to 7
    // remember that you are starting from the second value in rowNames, but the first row in citizen data


    // find the index of the age range with the maximum gender ratio difference using the identifyMaxDiff in StudyingData.java
    //** hint: note the index of the female ratio row and male ratio row in citizenData


    // print out the age range with each value for the female and male ratio
    
  }

}