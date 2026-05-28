package MoneyBankClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashTest {

    @Test
    void pay1() {
        Cash dollars = new Cash("john",100);
        assertFalse(dollars.pay(600));
        assertEquals(100, dollars.getBalance());

    }
    @Test
    void pay2() {
        Cash dollars = new Cash("john",100);
        assertTrue(dollars.pay(60));
        assertEquals(40, dollars.getBalance());
    }
    @Test
    void getPaymentDetails() {
        Cash dollars = new Cash("john",100);
        assertEquals("Cash Payment by john",dollars.getPaymentDetails());
    }

}