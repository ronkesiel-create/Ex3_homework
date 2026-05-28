package MoneyBankClass;

public class BankTransfer extends PaymentMethod implements Payable{

    private static final int COMMISSION = 5;
    private String _bankName;
    public BankTransfer(String ownerName, double balance, String bankName) {
        super(ownerName, balance);
        this._bankName = bankName;
    }

   public String getBankName(){
        return _bankName;
   }
   public void setBankName(String bankName){
        this._bankName=bankName;
   }
    /**
     * This method implements a payment
     * @param amount The amount to be paid
     * <p>
     * The payment can be carried out if and only if amount is equal or less than balance - COMMISSION.
     * as there is a commission on every bank transfer.
     * @return true if payment is successful, false otherwise
     */
    @Override
    public boolean pay(double amount) {

        if(amount <= getBalance()-COMMISSION){
            setBalance(getBalance()-amount-COMMISSION);
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
        return "Bank transfer from " +getBankName()+" ,owner "+getOwnerName();

    }

}
