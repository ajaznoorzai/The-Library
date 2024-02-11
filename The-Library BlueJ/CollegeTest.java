

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CollegeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CollegeTest
{
    /**
     * Default constructor for test class CollegeTest
     */
    public CollegeTest()
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
    public void Describe()
    {
        College college1 = new College(50, 12);
        college1.describe();
    }
    @Test
    public void Student()
    {
      College  college1 = new College(50, 12);
      college1.runCollege(5);
    }

    @Test
    public void mt()
    {
        College college1 = new College(6, 7);
    }

    @Test
    public void t2()
    {
    }

    /**@Test
    public void t3()
    {
        College.main({"6","7","8" });
    }
    */

    @Test
    public void ct3()
    {
        College college1 = new College(5, 6);
        college1.describe();
        college1.describe();
        college1.runCollege(1);
        college1.describe();
        college1.runCollege(3);
        college1.describe();
        college1.describe();
        college1.runCollege(1);
        college1.runCollege(2);
        college1.describe();
        college1.describe();
        college1.runCollege(1);
        college1.describe();
        college1.runCollege(1);
        Library library1 = new Library(5);
        Student student1 = new Student("dave", library1);
        student1.study();
        student1.describe();
        college1.runCollege(1);
        college1.runCollege(1);
        college1.describe();
        college1.runCollege(1);
        college1.runCollege(1);
        college1.describe();
        college1.runCollege(1);
        college1.runCollege(2);
        college1.runCollege(1);
    }

    //@Test
    //public void ct5()
    //{
    //    College.main({ "3","5","6"});
    //}

    @Test
    public void ct4()
    {
        College.main({"4","5","6" });
        College college1 = new College(3, 4);
        college1.describe();
        college1.runCollege(1);
        college1.describe();
        college1.runCollege(1);
        college1.describe();
        college1.runCollege(1);
        college1.describe();
        college1.describe();
        college1.runCollege(1);
        college1.describe();
        college1.runCollege(1);
        college1.describe();
        college1.runCollege(1);
        college1.describe();
        college1.runCollege(1);
        college1.describe();
        college1.runCollege(1);
        college1.runCollege(1);
        college1.describe();
        college1.runCollege(1);
        college1.describe();
        college1.runCollege(1);
        college1.runCollege(1);
    }
}






