public class Enemy01 {
    String name;
    int maxHealth;
    int currentHealth;
    int atk;
    int def;

    Enemy01(){
        name = "Bobby";
        maxHealth = 30;
        currentHealth = maxHealth;
        atk = 6;
        def = 5;
    }

    void attack(Player target){
        System.out.println(name + " attacks " + target.name);
        System.out.println(target.name + " took " + target.atk + " damage!");
        target.currentHealth -= atk;
        System.out.println("Their Heath is now at " + target.currentHealth);  
    }
}
