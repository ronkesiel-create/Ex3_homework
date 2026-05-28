package MoneyBankClass;

public class PaymentMethod {
    private String _ownerName;
    private double _balance;

    /**
     * this constructor gets an ownerName and balance
     * @param ownerName the name of the owner of the payment method.
     * @param balance The amount on money in the payment method.
     *  balance is set to zero if balance given is lower than zero
     */
    public PaymentMethod(String ownerName, double balance) {
        this._ownerName = ownerName;
        if (balance < 0) {
            this._balance = 0;
        }
        else {
            this._balance = balance;
        }
    }
    /**
     * this constructor gets an ownerName
     * @param ownerName the name of the owner of the payment method.
     * balance is set to zero by default
     */
    public PaymentMethod(String ownerName) {
        this(ownerName, 0);

    }
    public String getOwnerName() {
        return _ownerName;
    }
    public double getBalance() {
        return _balance;
    }
    public void setBalance(double balance) {
        this._balance = balance;
    }

    public void setOwnerName(String ownerName) {
        this._ownerName = ownerName;
    }


}
