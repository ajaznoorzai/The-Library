 

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void m1()
    {
        Library library1 = new Library(5);
        Student student1 = new Student("ee", library1);
        student1.study();
        student1.describe();
        assertEquals(5, student1.finishedStudies());
        student1.describe();
        student1.study();
        student1.study();
        assertEquals(4, student1.finishedStudies());
        student1.describe();
    }

    @Test
    public void st2()
    {
        Library library2 = new Library(3);
        Student student2 = new Student("Dave2", library2);
        student2.describe();
        assertEquals(2, student2.finishedStudies());
        student2.study();
        student2.describe();
        student2.describe();
        student2.describe();
        student2.study();
        student2.study();
        student2.describe();
        student2.describe();
        student2.describe();
        student2.describe();
        student2.study();
        student2.study();
        student2.describe();
        student2.study();
        student2.describe();
        assertEquals(0, student2.finishedStudies());
    }

    @Test
    public void st3()
    {
        Library library1 = new Library(5);
        Student student1 = new Student("dave3", library1);
        student1.study();
        student1.describe();
        assertEquals(3, student1.finishedStudies());
        student1.study();
        student1.describe();
        student1.study();
        student1.study();
        student1.describe();
        student1.study();
        student1.describe();
        student1.study();
        assertEquals(1, student1.finishedStudies());
        student1.study();
        student1.describe();
    }

    @Test
    public void st4()
    {
        Library library1 = new Library(11);
        Student student1 = new Student("dave4", library1);
        student1.describe();
        student1.describe();
        student1.study();
        student1.describe();
        student1.study();
        student1.study();
        student1.describe();
        student1.describe();
        assertEquals(false, student1.finishedStudies());
        student1.study();
        assertEquals(true, student1.finishedStudies());
        assertEquals(false, student1.finishedStudies());
        student1.study();
        student1.study();
        student1.describe();
        student1.study();
        student1.describe();
    }
}




