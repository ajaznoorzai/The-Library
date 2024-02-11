
import java.util.ArrayList;
import java.util.Random;
import java.util.*;
/**
 * Write a description of class College here.
 *
 * @author (Aj)
 * @version (10/12/2021)
 */
public class College
{
    // instance variables - replace the example below with your own
    private ArrayList<Student> students;
    private Library L1;
    private Random R1;
    
    

    /**
     * Constructor for objects of class College
     * @param numStudents - the number of Students enrolled at the college
     * @param TextBooks - the number of TextBooks in the library, respectively
     * 
     * 
     */
    public College(int numStudents , int TextBooks)
    {
        L1 = new Library(TextBooks);
        students = new ArrayList<Student>(numStudents);
        for (int i = 0; i < numStudents; i++ )
        {
          students.add( new Student("students" +i, L1)); 
        }
        
        R1 = new Random(); 
        
    }
    

    /**
     * prints out a simple description of the state of the College
     * such as students in college and number of books on shelf and how many cards its issued 
     */
    public void describe()
    {
        System.out.println("The college currently has"+students.size()+"hard-working students");
        L1.describe();
    }
    
    
    /**
     *
     *Internal use by this class only 
     *if there are no students method just prints out a message such as "Everything has gone quiet.", Otherwise a Student should be selected at random from those still at the College.  
     * 
     */private void nextStep()
    
    {
        //System.out.println(numberOfStudents); 

        int numberOfStudents = students.size();
        System.out.println(numberOfStudents); 
        int n = R1.nextInt(numberOfStudents);
        if(numberOfStudents == 0)
        {
            System.out.println("Everything has gone quiet.");
        }
        else 
        {
            //int n = R1.nextInt(numberOfStudents);
            Student student = students.get(n);
            
        }
        
        if(students.get(n).finishedStudies())
        {
         students.remove(L1);
         System.out.println("The student has graduated and left the college.");   
        }
        else 
        {
          students.get(n).study();  
        }
    }
    /**
     * unCollege the amount of time step it takes for college run 
     * @param nSteps amount of steps a college is run for  
     * 
     */
    public void runCollege(int nSteps)
    {
        for (int i = 0; i < nSteps; i++)
        {
            System.out.println("step" + (i+1)); //print out the number of the step being carried out
            describe();
            nextStep();
        }
        
    }
    /**
     * 
     * 
     * @param args used for number of students number of steps and number of books  
     */
    public static void main(String[] args)
    {
        College ollege = new College(Integer.parseInt(args[0]),Integer.parseInt(args[1]));  
        ollege.runCollege(Integer.parseInt(args[2]));
    }
    


}
        
        
        
  



//https://beginnersbook.com/2013/12/how-to-initialize-an-arraylist/