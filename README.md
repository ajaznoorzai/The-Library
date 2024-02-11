# The-Library




Required to write three Java classes: TextBook, Library and LibraryCard. Class TextBook represents information about a library text book. The Library and LibraryCard classes represent (university) libraries, and the cards that are issued to students to allow them to borrow text books:

A text book has a title and contains a number of chapters that can be 'read' one chapter at a time.
A new library has a book shelf that contains a collection of some number of text books.
A library will issue a library card to anyone who wants to become a borrower at the library.
A library card can be used to borrow text books from the library, up to a pre-specified number of times (after which, the card 'expires' and can no longer be used to borrow books).
When a text book is borrowed, it is removed from the book shelf and issued to the borrower (so the library contains one less book).
After being borrowed, a text book can be returned to the library, in which case it is put back on the book-shelf.
Full details of the classes are given below. Please note that it is important to follow the specification given for each class exactly (name of the class, signatures of the methods, etc.). The second assessed coursework assignment will build on the first, making various assumptions about the objects defined by the classes and the implemented behaviours.

The TextBook class.
Fields (Instance Variables):
The class should have three private fields: one of type String to represent the title of the text book, one of type int to represent the length of the book in chapters, and one of type int to represent the number of the last chapter to be read (i.e. the number of chapters read so far).

Constructor Method:
The class should provide a constructor method with two parameters, one of type String and the other of type int. The first parameter represents the title of the book and the second its length in chapters. The constructor should therefore initialise a TextBook object by setting the title of the book to the specified String, and the length of the book to the specified int. In addition, the number of the last chapter read should initially be set to zero (as nothing has been read at this point)

Other Methods:
A TextBook object should also have the following public methods associated with it:

a method getTitle() that returns the String that represents the title of the book.

a void method readNextChapter() that 'reads' the next chapter of the book (if this is possible): i.e. it should cause the 'last chapter' field to be increased by one, but only if there are chapters left to be read! If there are no more chapters left to read (i.e. the last chapter read was the final chapter of the book) then it should simply print out a suitable warning message.
a boolean method isFinished() that returns true if there are no chapters of the book left to read and false otherwise.
a void method closeBook() that resets the last chapter read field to zero (i.e. it is used to return the book to its initial state, ready for the next person to begin reading it).
a void method describe() that prints out a simple description of the text book, with the book title and number of chapters left to read, e.g.: "Programming with Java with 4 chapters left to read"
The LibraryCard Class
Fields (Instance Variables):
Your implementation of the LibraryCard class should provide the following private fields:  

an int field that holds the limit on the number of books that the card can be used to borrow.
an int field that holds the number of books that have been borrowed on the card so far.
a String field that holds a card reference, e.g. "cardID 3", "cardID 27" or "cardID 94".
 
Constructor:
The constructor method should take two int parameters:

the first is used to set the limit on the number of books that can be borrowed with the card.
the second is used to set the card reference. Note: the card reference should be a String of the form "cardID NUM", where NUM is the actual value of the second formal parameter of the constructor.
The constructor should also initialise the 'number of books borrowed' field as 0 when the card is constructed.

Methods:
There are four methods in addition to the constructor:

a method with signature public void swipe(), which when invoked, increases the number of books borrowed on the card by one.  (This is not required to check whether the lending limit is breached.)

a method with signature public boolean expired() which returns true if no more books can be borrowed on the card, and false otherwise.
a method with signature public String getCardRef() that returns the value of the card reference field.
a method with signature public void describe() that prints out a description of the card,  e.g. "Library card cardID 27 with 3 books left".
 
The Library Class
Fields (Instance Variables):
Your implementation of the Library class should declare the following private fields:

A field TextBook[] bookShelf which holds the library's collection of TextBook objects. (Note that the type of bookShelf is a fixed-length array of Textbook, not an ArrayList.)

You will also find it useful to have an int field (called nextBook or something similar) which indicates the position on the bookShelf where the next TextBook object can be found (the next one available for borrowing when someone presents a valid library card).
an int field representing the number of borrowers who have been issued with library cards.
Constructor:
The class should have a constructor with a single integer parameter which determines the maximum number of TextBook objects that may be held on the library's bookShelf.

Note: A problem here is to set up the Library object up so that it contains TextBook objects in an array. There are several steps in Java to setting up an array of objects:

Declare a variable of the appropriate type (in this case it is just the field bookShelf).
Create an array and store it in the variable (at this point it is an array of nulls).
Fill the array up with suitable objects (for which you will need to use a suitable loop statement)
A further issue is how to construct the TextBook objects that are put into the bookShelf array. One possibility is to give all the books the same title and number of chapters. A better possibility would be to give the books different titles, for example "text book 1", "text book 2","text book 3" and so one (the number of chapters can still be the same for each book). This is fairly simple to do as you can keep track of the number of each book as you go through the loop statement.

Methods:
The class has the following methods in addition to the constructor:

a method with signature public LibraryCard issueCard() that when invoked issues (i.e. returns) a new LibraryCard object. The method should increment the count of the number of library borrowers by 1. Note: to issue a new LibraryCard it is necessary to provide two int parameter values (see description of LibraryCard constructor, above). The limit on borrowing can be fixed with a small int value, such as 5. However, the card identity number should be unique to each card, so you need to find a way of setting the actual parameter value to a different int value each time a new card is constructed. (Hint: think about numbering the cards sequentially, according to the number of borrowers. So, the first card issued might be given the reference "cardID 0", the next card "cardID 1", and so on.)

A method with signature public TextBook borrowBook(LibraryCard card), which allows a book to be borrowed from the library if a valid (i.e. non-expired) LibraryCard is presented. If there are still books left to be borrowed in the library and the card object has not expired, then the method should return the next TextBook object from the bookShelf array (and otherwise, it should return the null object). The method should also 'remove' the TextBook object from the bookShelf (by setting the array location to null) and increment the field that indicates the location of the next book that may be borrowed. Finally, the method should ensure that the library card is 'swiped' to record that a book has been borrowed. You should also ensure that your method behaves sensibly if passed a null LibraryCard object.
a method with signature public void returnBook(TextBook book) that allows a book to be handed back to the library. The method will need to put the book back in the bookShelf array.  (Ideally, this method would also reduce the number of books borrowed on the relevant card. But for this coursework, you are not required to implement that feature.)  It is important that the replacement of the book is done in a way that ensures there are no 'gaps' on the shelf. You may find that the pointer to the next book to be borrowed is again useful here. Once the TextBook has been put back in the array, the method will also need to change the 'next book' pointer appropriately.
a method with signature public void describe() that, as usual, is responsible for printing out a description of the object. In this case, an example of the sort of message that should be printed out is: "The library has 15 books left on the shelf and has issued 7 library cards".
Testing
Having written the classes make sure that they work properly. Get one or more instances of the classes onto the BlueJ workbench and check that they behave the way that they should. Check what happens if you try to borrow a book with an invalid card, or when there are no books left on the book shelf. Make sure that you can only borrow as many books from the library as were put on the book shelf in the first place, and that a library card expires once it has been swiped up to its limit. Use BlueJ's inspect facility to check that text books borrowed from the library really are removed from the bookShelf array.

Layout and Code Style
It is important to make sure that you lay out your code properly. In particular make sure that everything is indented properly, and that opening and closing braces are lined up. Also make sure you use meaningful variable names and follow the Java naming conventions (i.e. follow capitalisation conventions). Note that no comments are required at this stage. We will be looking at commenting later.
