package abstraction;

public class Savings extends Account {

    public void interest()
    {
        System.out.println("7% interest");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Account a = new Savings();
        a.interest();

    }

}
