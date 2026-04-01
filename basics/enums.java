package basics;

public enum enums {
    DEAD,
    ALIVE,
    EXACTLY_ZERO 
}

class enemy{
    int health;
    enums state;
    public enemy(int hp) {
        health = hp;
        state = enums.ALIVE;
    }
    void fight(int dmg) {
        health -= dmg;
        if(health < 0) {
            state = enums.DEAD;
        }
        if(health == 0 ) {
            state = enums.EXACTLY_ZERO;
        }
        switch (state) {
            case DEAD -> System.out.println("The enemy is dead");
            case ALIVE -> System.out.println("The enemy is still alive and has " + health + "HP left");
            case EXACTLY_ZERO -> System.out.println("The enemies health has been reduced to exactly zero");
        }
    }
}

class Main {
    public static void main(String[] args) {
        int heroes_sword = 10;
        enemy zombie = new enemy(5);
        enemy armored_zombie = new enemy(10);
        enemy dragon = new enemy(500);

        zombie.fight(heroes_sword);
        armored_zombie.fight(heroes_sword);
        dragon.fight(heroes_sword);
    }
}