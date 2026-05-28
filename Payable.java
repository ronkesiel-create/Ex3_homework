package MoneyBankClass;


public interface Payable {
    /**
     * This method implements a payment
     * @param amount The amount to be paid
     * <p>
     * The payment can be carried out if and only if amount is equal or less than balance.
     * @return true if payment is successful, false otherwise
     */
    boolean pay(double amount);   // represents payment method
    /**
     * This method returns a String representation of payment method (including the card number and the name of the owner)
     * @return the String representation
     */
    String getPaymentDetails();   // represents the Details of the Payment
}
