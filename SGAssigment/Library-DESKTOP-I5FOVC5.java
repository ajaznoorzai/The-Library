
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
    private int nextBook;
    private int numberofborrowers;
    
    public Library(int textbooks)
    {
        bookShelf = new TextBook[textbooks];
        //for loop
        for (int i = 0; i < textbooks; i++)
        //{
          //bookShelf[i]=TextBook("",5);
        //}
        nextBook = 0;
        bookShelf=null;
        
    }

    public LibraryCard issueCard(int p1, int cardID)
    {
       LibraryCard card = new LibraryCard(p1, cardID);
        borrowers++;
        String ref;
        ref=card.getCardRef();
        ref+=""+borrowers;
        System.out.println(ref);
        //bookShelf[borrowers-1]=new TextBook(10, ref);
        return  card; 
    }
 
    //public int issueCard() 
    //{ 
        //return numberofborrowers++; 
    //}
    public TextBook borrowBook(LibraryCard card)
    {
       TextBook next=null;
        int i=0;
        next=bookShelf[i];
        if(!card.expired())
        { 
            bookShelf[i]=null;
            i++;
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
     borrowers--;
     int i=0;
     bookShelf[i]=book;
     i++;
    }
    //LibraryCard.Cardreference =="valid" &&
    
    public void describe() 
    {
     System.out.println("The library has" + nextBook +"books left on the shelf and has issued" + numberofborrowers +  "library cards");
    }
}



  