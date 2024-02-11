
/**
 * Write a description of class TextBook here.
 *
 * @author (Ajaz Noorzai)
 * @version (Version 11)
 */
 public class TextBook
 {
    
   private String BookTitle;
   private int LengthChapters;
   private int NumberOfChaptersRead;

    
    public TextBook(String BT, int LengthOfChapters)
    {
        BookTitle = BT;
        LengthChapters = LengthOfChapters;
        NumberOfChaptersRead = 0;
    }
    
    public String getTitle()
    {
       return BookTitle; 
    }
   
    public void readNextChapter()
    {
     if(LengthChapters > NumberOfChaptersRead)
     {
       NumberOfChaptersRead++;
     }
    
     else 
     {
        System.out.println("This was the last Chapter");
     }
    }
   
   
    public boolean isFinished()
   
    {
     if (NumberOfChaptersRead==LengthChapters)
     {
       return true;
     }
     else 
     {
       return false;
     } 
    }
   
       public void closeBook()
    {
       NumberOfChaptersRead=0;
    }
    
    public void describe() 
       
    {
       System.out.println(BookTitle+" with "+ (LengthChapters-NumberOfChaptersRead) +"chapters left to read");
       
    }
   
    
}
