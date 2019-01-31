package rpg;
public class Character {
    static Dice dice = new Dice ();
    private String name;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int maxLife;
    private int currentlife;    
    
    
    
    public Character (String n, int s, int d, int i){
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i; 
        this.maxLife = dice.roll()+20;
        this.currentlife = maxLife;
    }
    public int attack(){
        return dice.roll() + strength;
        
    }
    public void wound (int damage){
        currentlife = currentlife - damage;
        
    }
    public void heal (int heal){
        if (currentlife < maxLife){
        currentlife = currentlife + heal;
        }
    }
    public String getName(){
        return name;
    }
    public int getStrength(){
        return strength;
    }
    public int getDexterity(){
        return dexterity;
       
    }
    public int getIntelligence(){
        return intelligence;
        
    }
    public int getCurrentLife(){
       /*if (currentlife < 0){
           currentlife = 0;
       } */
       return currentlife;
    }
    public int getMaxlife(){
        return maxLife;
    }

}
