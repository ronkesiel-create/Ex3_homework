package MoneyBankClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentMethodTest {

    @Test
    void getOwnerName() {
       PaymentMethod newOwner = new PaymentMethod("john",500);
        System.out.println(newOwner.getOwnerName());
        assertEquals("john",newOwner.getOwnerName());
    }

    @Test
    void getBalance() {
        PaymentMethod newOwner = new PaymentMethod("john",500);
        System.out.println(newOwner.getBalance());
        assertEquals(500,newOwner.getBalance());
    }

    @Test
    void setBalance() {
        PaymentMethod newOwner = new PaymentMethod("john",500);
        System.out.println(newOwner.getBalance());
        newOwner.setBalance(750);
        assertEquals(750,newOwner.getBalance());
    }
}