public class Pets {
    private int level;
    private String type;
    private String name;

    Pets(String name) {
        this.level = 1;
        this.type = "normal";
        this.name = name;
    }

    public void setType(String type) {
        if(type.equals("normal") || type.equals("epic") || type.equals("legend")) {
            this.type = type;
        } else {
            throw new Error("Wrong pet type format");
        }
    }

    public String getType(){
        return this.type;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
