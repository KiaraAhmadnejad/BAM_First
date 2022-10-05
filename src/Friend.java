public class Friend {
    //Instansvariabler
    //Instance variables
    String name= "A friend";
    private int hp = 100;
    boolean isFriend = true;

    public Friend(){

    }

    public Friend (String name){
        this.name = name;

    }

    public Friend ( String name, boolean isFriend ){
        this.name = name;
        this.isFriend = isFriend;
    }

    public void hit (int damage){
        this.hp = this.hp- damage;

    }

    public int getHp(){
        return this.hp;
    }

    public void setHP(int hp){
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}