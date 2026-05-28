package MoneyBankClass;

public class Cash extends PaymentMethod implements Payable{

    public Cash(String ownerName, double balance) {
        super(ownerName, balance);
    }


    /**
     * This method implements a payment
     * @param amount The amount to be paid
     * <p>
     * The payment can be carried out if and only if amount is equal or less than balance
     * if payment is successful, it reduces the balance by amount
     *
     * @return true if payment is successful, false otherwise
     */
    @Override
    public boolean pay(double amount)
    {
        if (amount <= getBalance()){
            setBalance(getBalance()- amount);
            return true;
        }
        else{
            return false;
        }
    }


    /**
     * This method returns a String representation of payment method (including the name of the owner)
     * @return the String representation
     */
    @Override
    public String getPaymentDetails() {
        return "Cash Payment by "+ getOwnerName();
    }


}
