
public class mainProject
{
    public static void main(String[] args)
    {

        Weapon weapon = new Weapon(5, 10);
        Player player = new Player(5, weapon);
        Enemy enemy = new Enemy(100);

        do {
            player.attack(enemy);
        }
        while(enemy.getHealth() > 0);

    }
    

}