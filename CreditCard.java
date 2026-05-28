package MoneyBankClass;

public class CreditCard extends PaymentMethod implements Payable{

    private String _cardNumber;
    public CreditCard(String ownerName, double balance, String cardNumber) {
        super(ownerName, balance);
        this._cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return this._cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this._cardNumber = cardNumber;
    }
    /**
     * This method implements a payment
     * @param amount The amount to be paid
     * <p>
     * The payment can be carried out if and only if amount is equal or less than balance + 1000.
     * @return true if payment is successful, false otherwise
     */
    @Override
    public boolean pay(double amount) {

        if(amount <= getBalance()+1000){
            setBalance(getBalance()-amount);
            return true;
        }
        return false;
    }
    /**
     * This method returns a String representation of payment method (including the card number and the name of the owner)
     * @return the String representation
     */
    @Override
    public String getPaymentDetails() {
        return "Credit Card ending with " +getCardNumber()+" by "+getOwnerName();

    }

}
