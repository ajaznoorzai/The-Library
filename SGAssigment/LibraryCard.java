
/**
 * Write a description of class LibraryCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LibraryCard
{
    // instance variables - replace the example below with your own
    private int limit;
    private int NumberOfBooksBorrow;
    private String Cardreference;

    /**
     * Constructor for objects of class LibraryCard
     */
    public LibraryCard(int newLimit, int cardreference)
    {
     limit = newLimit;
     Cardreference = "cardID " + cardreference; 
     NumberOfBooksBorrow=0;
    }
    
    public void swipe()
    {
       NumberOfBooksBorrow++; 
    }
    
    
    public boolean expired()
    { 
        if (limit<=NumberOfBooksBorrow)
        //if (NumberOfBooksBorrow==limit)
        { 
            return true; 
        }
        else 
        { 
            return false;
        } 
    }
    
    
     public String getCardRef()
    {
        return Cardreference;
    }
    
    public void describe() 
    { 
        System.out.println("Library card" + Cardreference + "with" +(limit-NumberOfBooksBorrow) + "Books left");
    }
     
    
  
  
  
  
  
}
  
  
  

  
