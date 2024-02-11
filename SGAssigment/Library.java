
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private TextBook[] bookShelf;
    private int borrowers;
    private int nextBook = 0;
    private int NumberOfBooksBorrow;
    
    public Library(int textbooks)
    {
        bookShelf = new TextBook[textbooks];
        //for loop
        for (int i = 0; i < textbooks; i++) 
      {
          bookShelf[i]= new TextBook("Java"+i,1);
      }
        nextBook = 0;
        //bookShelf= null;
        
    }

  
    
    
    public LibraryCard issueCard(int newlimit, int cardID)
    
    {
       LibraryCard card = new LibraryCard(newlimit, cardID);
       borrowers++;
       bookShelf[borrowers-1]= borrowBook(card);
        return  card; 
     }
 
    public TextBook borrowBook(LibraryCard card)
    
    {
    
       TextBook next=null;
     
        next=bookShelf[nextBook];
        if(!card.expired())
        { 
            bookShelf[nextBook]=null;
            nextBook++;
            card.swipe();
            return next;     
        }
        else
        {
        return null;
        }  
    }
    
    public void returnBook(TextBook book)
    
    { 
     NumberOfBooksBorrow--;
     bookShelf[nextBook] = book;
     
    }
    
    public void describe() 
    {
     System.out.println("The library has" + nextBook +"books left on the shelf and has issued" + NumberOfBooksBorrow +  "library cards");
    }
}



  