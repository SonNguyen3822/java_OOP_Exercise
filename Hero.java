import java.util.ArrayList;

public class Hero {
    private int level;
    private String bodyArmor;
    private String bodyLeg;
    private String shoes;
    private String gloves;
    private String wing;
    private String weapon;
    private String treasure;
    private String cloack;
    private String name;
    private Pets[] pets;
    private Pets riding_pet;

    Hero(String name) {
        this.level = 1;
        this.name = name;
    }

    public String toString() {
        String results = "-------------------\n";
        results += "Name: ".concat(this.name).concat("\n");
        results += "Level: ".concat(Integer.toString(this.level));
        return results;
    }

    public void riding_pet(int index) {
        switch(this.pets[index].getType()) {
            case "normal":
                if(this.level >= 10) this.riding_pet = this.pets[index]; 
                break;
            case "epic":
                if(this.level >= 100) this.riding_pet = this.pets[index];
                break;
            case "legend":
                if(this.level >= 500) this.riding_pet = this.pets[index];
                break;
        }
    }

    public Pets pet () {
        return this.riding_pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }

    public void addPets(Pets[] pets) {
        this.pets = pets;
    }

    public int caculatePower() {
        int power = 0;
        switch(this.riding_pet.getType()) {
            case "normal":
                if(this.level >= 1 && this.level < 20) power += 50;
                if(this.level >= 20 && this.level < 40) power += 100;
                if(this.level >= 40 && this.level < 60) power += 150;
                if(this.level >= 60 && this.level < 80) power += 200;
                if(this.level >= 80 && this.level <= 100) power += 300;
                break;
            
            case "epic":
                if(this.level >= 1 && this.level < 20) power += 70;
                if(this.level >= 20 && this.level < 40) power += 150;
                if(this.level >= 40 && this.level < 60) power += 200;
                if(this.level >= 60 && this.level < 80) power += 300;
                if(this.level >= 80 && this.level <= 100) power += 400;
                break;
            
            case "legend":
                if(this.level >= 1 && this.level < 20) power += 100;
                if(this.level >= 20 && this.level < 40) power += 200;
                if(this.level >= 40 && this.level < 60) power += 300;
                if(this.level >= 60 && this.level < 80) power += 450;
                if(this.level >= 80 && this.level <= 100) power += 600;
                break;
        }
        return power;
    }
}
