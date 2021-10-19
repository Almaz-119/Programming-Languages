package task2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;


import org.junit.Test;

public class BookTest {
    
    @Test
    public void Book_setsParameters() {
        Book b1 = Book.make("abc"," defi", "SCIFI", "  1000");
        Book b2 = Book.make("abc"," defi", "SCIFI", "  1000");

        assertEquals(1000, b1.getReservePrice());
        assertEquals(1000, b2.getReservePrice());

        assertEquals(0, b1.getId());
        assertEquals(1, b2.getId());
    }

    @Test
    public void make_Types() {
        assertEquals(null, Book.make("abc"," defi", "SCIFI", "thousands"));
        assertEquals(null, Book.make("abc"," defi", "ADBA", "thousands"));
        assertNotEquals(null, Book.make("abc"," defi", "SCIFI", "  1000"));
    }

    @Test 
    public void compare_LessOrGreater() {
        Book b1 = Book.make("Almaz", "KG", "Stud", "1000");
        Book b2 = Book.make("Beka", "KG", "Teach", "10000");
    }
}
