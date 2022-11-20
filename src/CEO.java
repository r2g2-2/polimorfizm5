public class CEO extends Worker
{
    private int bonus;

    public CEO(String firstName, String lastName, int pay, int bonus)
    {
        super(firstName, lastName, pay);
        this.bonus = bonus;
    }

    public int getBonus()
    {
        return bonus;
    }

    public void setBonus(int bonus)
    {
        this.bonus = bonus;
    }

}
