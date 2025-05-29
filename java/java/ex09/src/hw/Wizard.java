package hw;
public class Wizard {
    private String name;         // 魔法師名稱
    private int level;           // 魔法師等級
    private String specialty;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setLevel(int level){
        this.level = level;
    }
    int getLevel(){
        return level;
    }
    void setSpecialty(String specialty){
        this.specialty = specialty;
    }
    String getSpecialty(){
        return specialty;
    }
    void levelUp(){
        this.level+=10;
    }
    String castSpell(){
        return String.format("%S cast a powerful %S spell !",name,specialty);
    }
    @Override
    public String toString(){
        return String.format("name=%s,level=%s,specialty=%s",name,level,specialty);
    }
}