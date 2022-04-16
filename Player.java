public class Player 
{
    private Weapon weapon;
    private int damageBase;

    public Player(int damageBase, Weapon weapon)
    {
        this.damageBase = damageBase;
        this.weapon = weapon;
    }
    public void attack(Enemy enemy)
    {
        int damage = damageBase + weapon.rollDamage();
        enemy.hit(damage);

        System.out.println("Player hit enemy for " + damage + " damage " + " enemy is at " + enemy.getHealth() + "% health");
    }
    
    
}
