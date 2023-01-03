import org.example.Note;
import org.example.NotesServiceImpl;
import org.junit.jupiter.api.*;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class NotesServiceImplTest {

    public NotesServiceImpl notesServiceImpl;
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
        notesServiceImpl = new NotesServiceImpl(null);
    }

    @AfterEach
    void tearDown() throws Exception {
        log.info("AfterEach");
        notesServiceImpl = null;
    }


    @Test
    void testIsPalindromeEmptyString() {
        assertEquals(notesServiceImpl.getClass().toString(), "class org.example.NotesServiceImpl");
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
