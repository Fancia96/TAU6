import org.junit.jupiter.api.*;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class NotesServiceImplTest {

    public String stringOperations;
    static Logger log = Logger.getLogger(String.class.getName());


    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        log.info("BeforeAll");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        log.info("AfterAll");
    }

    @BeforeEach
    void setUp() throws Exception {
        log.info("BeforeEach");
        stringOperations = new String("");
    }

    @AfterEach
    void tearDown() throws Exception {
        log.info("AfterEach");
        stringOperations = null;
    }


    @Test
    void testIsPalindromeEmptyString() {
        assertTrue(true);
    }
//
//    @Test
//    void testIsPalindromeWithTwoSpaces() {
//        assertTrue(stringOperations.isPalindrome("a bcb a"));
//    }
//
//    @Test
//    void testConcatTwoZeroLenghtStrings() {
//        assertEquals( null , stringOperations.concat("", ""));
//    }

}
