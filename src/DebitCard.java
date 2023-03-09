public class DebitCard {
    private String accountNumber;
    private int money;
    public DebitCard(){
        super();
    }
    public DebitCard(String accountNumber,int money){
        super();
        setAccountNumber(accountNumber);
        setMoney(money);
    }
    public  String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        if(money < 0){
            throw new UnValidMoneyExceotion("余额无效"+money);
        }
        this.money = money;
    }
}
