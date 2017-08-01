import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by janinewei on 7/31/17.
 */
public class FirstRatingsTest {
    private FirstRatings fr;

    @Before
    public void setUp() throws Exception {
        fr = new FirstRatings();
    }

    @After
    public void tearDown() throws Exception {
        fr = null;
    }

    @Test
    public void testLoadMovieTest() {
        fr.testLoadMovies();
    }

    @Test
    public void testLoadRatersTest() {
        fr.testLoadRaters();
    }
}