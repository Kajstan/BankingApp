import org.example.Account;
import org.junit.Assert;
import org.junit.Test;

public class BankingAppTesting {
@Test
    public void whenUserDepositMoneyHeHaveMoreMoney(){
    Account account= new Account("Kaj", "Stan");
   account.deposit(100);
    Assert.assertEquals(200, account.getBalance());
}
}
