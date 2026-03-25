package classRelated;

public class Classes {
    //attributes
    String name;
    String region;
    int ad;
    int level;
    double crit_chance;

    //methods
    boolean is_tons_of_damage() {
        if(this.ad > 200) {
            System.out.println("YOU DEAL TONS OF DAMAGE");
            return true;
        }
        return false;
    }

    //Constructor
    Classes(String name, String region, int ad, int level, double crit_chance) {
        this.name = name;
        this.region = region;
        this.ad = ad;
        this.level = level;
        this.crit_chance = crit_chance;
    }
}
