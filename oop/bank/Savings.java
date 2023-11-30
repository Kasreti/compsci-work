public class Savings extends Account{
    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    private String clientID;
    public static final double INTEREST = 0.05;

    public Savings(String number, double funds, String clientID){
        super(number, funds);
        this.clientID = clientID;
    }

    public double calculateInterest(){
        return this.getFunds() * INTEREST;
    }

    public boolean equals(Savings account){
        return (this.clientID == account.clientID)&&(this.getNumber()==account.getNumber());
    }

    public String toString(){
        String x = "ClientID: " + this.clientID;
        x = x + "  Acct: Savings";
        x = x + "  Number: " + this.getNumber();
        x = x + "  Funds: " + String.format("$%,.2f", this.getFunds());
        return x;
    }

}