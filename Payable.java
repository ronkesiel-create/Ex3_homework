package MoneyBankClass;

/**
 *
 */
public interface Payable {
    boolean pay(double amount);   // represents payment method
    String getPaymentDetails();   // represents the Details of the Payment
}
