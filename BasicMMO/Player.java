public class Player {
    private String name;
    private String description;
    private int health;
    private int attack;

    public Player(String name, int health, int attack, String description) {
        this.name = name;
        this.description = description;
        this.health = health;
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}