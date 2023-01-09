import org.example.MockSystemNotesService;
import org.example.Note;
import org.example.NotesServiceImpl;
import org.junit.jupiter.api.*;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;


public class NotesServiceImplTest {

    MockSystemNotesService env;
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

        env = new MockSystemNotesService();
        notesServiceImpl = new NotesServiceImpl(env);

    }

    @AfterEach
    void tearDown() throws Exception {
        log.info("AfterEach");
        notesServiceImpl = null;
    }


    @Test
    void testIsItAClass() {
        assertEquals(notesServiceImpl.getClass().toString(), "class org.example.NotesServiceImpl");
    }

    @Test
    void testAddingANote() {
        Note note = new Note("note 1", 44.5F);
        notesServiceImpl.add(note);

        assertTrue(env.checkIfNoteAdded(note));
    }

    @Test
    void testAddingANoteAndNotFindingIt() {
        Note note = new Note("note 1", 44.5F);
        Note note2 = new Note("note 1", 43.5F);
        notesServiceImpl.add(note);

        assertFalse(env.checkIfNoteAdded(note2));
    }
//
//
//    @Test
//    void testIsPalindromeWithTwoSpaces() {
//        assertTrue(stringOperations.isPalindrome("a bcb a"));
//    }

//    @Test
//    void testConcatTwoZeroLenghtStrings() {
//        assertEquals( null , stringOperations.concat("", ""));
//    }

}
