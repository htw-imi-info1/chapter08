
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CommandWordsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommandWordsTest
{
    /**
     * Default constructor for test class CommandWordsTest
     */
    public CommandWordsTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void isCommandGo()
    {
        assertEquals(true, CommandWords.isCommand("go"));
    }

    @Test
    public void isCommandQuit()
    {
        assertEquals(true, CommandWords.isCommand("quit"));
    }

    @Test
    public void isCommandHelp()
    {
        assertEquals(true, CommandWords.isCommand("help"));
    }
     @Test
    public void isNotACommand()
    {
        assertEquals(false, CommandWords.isCommand("xxx"));
    }
}

