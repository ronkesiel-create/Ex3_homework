package MoneyBankClass;

import java.lang.classfile.Superclass;

/**
 * This  main method is taking an array with 3 instances of payable methods.
 * then does on every  instance the pay function with set amount.
 * print if the Transaction was successful or not and if so, prints the remaining balance in the set  instance.
 *
 */
public class PaymentTest {
    public static void main(String[] args) {
        Payable[] methods = new Payable[3];
       methods[0] = new Cash("Bob", 300);
       methods[1] = new CreditCard("Alex", 600,"9876");
       methods[2] = new BankTransfer("John", 200,"Bank Trade In");
       for(int i = 0; i < methods.length; i++) {
           {

               System.out.println(methods[i].getPaymentDetails());
               if (methods[i].pay(250)) {
                   System.out.println("Transaction successful");

                   System.out.println("The amount of money left from the transaction is: "+((PaymentMethod)methods[i]).getBalance());
               }

               else {
                   System.out.println("Transaction failed");
               }
               System.out.println();
           }
       }
    }



}
