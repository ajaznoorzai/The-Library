import java.util.*;
/**
 * Write a description of class Student here.
 *
 * @author (Aj)
 * @version (10/12/2021)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String nameStudent;
    private Library collegeLibrary;
    private LibraryCard LibraryCardIssued;
    private TextBook currentBorrowed;

    /**
     *  
     * @param name representing the Student's name
     * @param library representing the library that the Student joins
     * 
     */
    public Student(String name, Library library)

    {
        nameStudent = name;
        collegeLibrary = library;
        currentBorrowed = null;
        LibraryCardIssued = new LibraryCard(0, 10);

        
    }
    
    /**
     * @return true or false 
     * return true if the student does not have a TextBook to read, but can't borrow one because the LibraryCard has expired.otherwise returns false
     * 
     */
    public boolean finishedStudies() 
    
    {
        if (currentBorrowed == null && LibraryCardIssued.expired())
        {
            return true; 
        }
        return false;
    }

    
    /**
     * Causes the student to study
     * if the Student does not currently have a TextBook then the student tries to borrow one from the library
     * if the student does have a book and it is not finished, then the student reads one chapter of the book
     * 
     */
    public void study()
    {
        if (currentBorrowed == null)

        {
            currentBorrowed = collegeLibrary.borrowBook(LibraryCardIssued);   
        }
        else if (currentBorrowed.isFinished() == false)
        {
            currentBorrowed.readNextChapter();
        }

        else
        {
            currentBorrowed.closeBook();
            collegeLibrary.returnBook(currentBorrowed);
            currentBorrowed = null;
        }
    }

    /**
     * if whether or not they have a TextBook and if they do have book, whether or not the book is finished or they are still reading it
     * 
     */
    
    public void describe()
    {
        System.out.println();

        if (currentBorrowed == null) //if the student borrowed or has a book
        {
            System.out.println("Student" + nameStudent + "has no books");
        }
        else 
        {
            currentBorrowed.describe();
         
        
          if (currentBorrowed.isFinished())

          {
           System.out.println("Student" + nameStudent + "has finished the book");
            
          }
          else 
          {
            System.out.println("Student" + nameStudent + "is still reading");
          }   

          }
    }  

 }

//01903703270

//doc for public only 
//comments for everything 
//" - name:" + nameStudent