
package rpg;
public class Goku extends Character implements Weapon,Armor{
    Dice dice = new Dice ();
    protected int currentmagic,maxmagic;
        
    public Goku(String n, int s, int d, int i) {
        super(n, s, d, i);
        currentmagic = maxLife;
        maxmagic = maxLife;   
    }
    
    public int castKamehameha() {
            if(currentmagic >= 5){
                currentmagic = currentmagic - 5;
                return dice.roll() + dexterity;
                } 
            else{
                return 0;
            }
    }
    public int castGenkidama() {          
        if(currentmagic >= 10){
                currentmagic = currentmagic - 10;
                return dice.roll() + dexterity;
                }
            else{
                return 0;
            }
    }
    public int getCurrentmagic() {
        return currentmagic;
    }

    public int getMaxmagic() {
        return maxmagic;
    }
    
    @Override
    public int attack(){
       return dice.roll() + strength;    
    }
    @Override
    public int useArmor(){
        int x = dice.roll() + strength;  
        heal(x);
        return x;
    }
    @Override
    public int useWeapon(){
        return dice.roll() + strength;    
    }
}
