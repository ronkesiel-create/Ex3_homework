package MoneyBankClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransferTest {

    @Test
    void pay1() {
        BankTransfer newBank = new BankTransfer("john",120,"business bank");
        assertFalse(newBank.pay(600));
        assertEquals(120, newBank.getBalance());

    }
    @Test
    void pay2() {
        BankTransfer newBank = new BankTransfer("john",750,"business bank");
        assertFalse(newBank.pay(600));
        assertEquals(150, newBank.getBalance());
    }
    @Test
    void getPaymentDetails() {
        BankTransfer newBank = new BankTransfer("john",750,"business bank");
        assertEquals("Bank transfer from business bank ,owner john",newBank.getPaymentDetails());
    }
}