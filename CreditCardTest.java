package MoneyBankClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void pay1() {
        CreditCard dollarsCard = new CreditCard("john",120,"5467");
        assertFalse(dollarsCard.pay(600));
        assertEquals(120, dollarsCard.getBalance());

    }
    @Test
    void pay2() {
        CreditCard dollarsCard = new CreditCard("john",750,"5467");
        assertFalse(dollarsCard.pay(600));
        assertEquals(150, dollarsCard.getBalance());
    }
    @Test
    void getPaymentDetails() {
        CreditCard dollarsCard = new CreditCard("john",750,"5467");
        assertEquals("Cash Payment by john",dollarsCard.getPaymentDetails());
    }
}