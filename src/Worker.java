public class Worker extends Person
{
    private int pay;

    public Worker(String firstName, String lastName, int pay)
    {
        super(firstName, lastName);
        this.pay = pay;
    }

    public int getPay()
    {
        return pay;
    }

    public void setPay(int pay)
    {
        this.pay = pay;
    }

    public Worker(Worker other)
    {
        super(other);
        this.pay = other.pay;
    }
}