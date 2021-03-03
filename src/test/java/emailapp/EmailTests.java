package emailapp;



//import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class EmailTests {
    Email email = new Email("Tamer", "George",
            "tt55978$%", "tamer.george@sales.company.com", 500,
            "tamer@gmail.com");

    @Test
    @Order(1)
    void testSetMailBoxCapacity() {
        assertEquals(500, email.getMailBoxCapacity());
    }

    @Test
    @Order(2)
    void testSetAlternateEmail() {
        String expected = email.getAlternateEmail();
        String actual = "tamer@gmail.com";
        assertEquals(actual, expected);
    }

    @Test
    @Disabled
    void testGetMailBoxCapacity() {
        int mailCapacity = 500;
        int expected = email.getMailBoxCapacity();
        assertEquals(mailCapacity, expected);
        // Assumptions.assumingThat(mailCapacity >500,()-> System.out.println("The mail capacity is over than 500mb"));
    }

    @Test
    @Order(3)
    void testGetPassword() {
        assertEquals("tt55978$%",
                email.getPassword());
    }
}
