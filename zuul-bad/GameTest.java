
import static org.hamcrest.Matcher.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GameTest.
 *
 * @author  Barbara Kleinen
 */
public class GameTest
{
    private Game game1;

    /**
     * Default constructor for test class GameTest
     */
    public GameTest()
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
        game1 = new Game();
    }

    @Test
    public void testQuit()
    {
        Command quit = new Command("quit", null);
        assertEquals(null, game1.processCommand(quit));
    }

    @Test
    public void testHelp()
    {
        Command help = new Command("help", null);
        assertTrue("should print help message containing command words", game1.processCommand(help).contains("command words"));
    }

    @Test
    public void testGoSouth()
    {
        Command goSouth = new Command("go", "south");
        assertTrue("should be in computing lab",game1.processCommand(goSouth).contains("computing lab"));
    }

    @Test
    public void testGoNorth()
    {
        Command goNorth = new Command("go", "north");
        assertEquals("no exit warning should be printed","There is no door!\n",game1.processCommand(goNorth));
    }

    @Test
    public void completeWalkthrough()
    {
        Command goNorth = new Command("go", "north");
        Command goEast = new Command("go", "east");
        Command goSouth = new Command("go", "north");
        Command goWest = new Command("go", "west");

        goAndSee("east",  "lecture theater");
        goAndSee("west",  "main entrance");
        goAndSee("west",  "campus pub");
        goAndSee("east",  "main entrance");
        goAndSee("south", "computing lab");
        goAndSee("east",  "admin office");
        goAndSee("west",  "computing lab");
        goAndSee("north", "main entrance"); 
    }
    private void goAndSee(String direction, String whatShouldBeContained){
        String result = game1.processCommand(new Command("go", direction));
        if (!result.contains(whatShouldBeContained))
            fail(result +" does not contain "+whatShouldBeContained);
    }
}

