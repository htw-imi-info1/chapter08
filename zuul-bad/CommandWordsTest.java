
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
    CommandWords commandWords;
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
        commandWords = new CommandWords();
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
        assertEquals(true, commandWords.isCommand("go"));
    }

    @Test
    public void isCommandQuit()
    {
        assertEquals(true, commandWords.isCommand("quit"));
    }

    @Test
    public void isCommandHelp()
    {
        assertEquals(true, commandWords.isCommand("help"));
    }
     @Test
    public void isNotACommand()
    {
        assertEquals(false, commandWords.isCommand("xxx"));
    }
}

