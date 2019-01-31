package rpg;
public class TestCharacter {      
    
    Character Joe = new Character ("Joe",10,10,10);
    Character Bob = new Character ("Bob",10,10,10);  
    
    public void Display(){  
    
        for (int i = 1 ; Joe.getCurrentLife() >= 0 && Bob.getCurrentLife () >= 0 ; i++ ){
            System.out.println("Round " + i);            
            Print2Life();
            
            int a = Joe.attack();
            Bob.wound(a);
            int b = Bob.attack();
            Joe.wound(b);
                        
            System.out.println(Joe.getName()+ " attacks " + Bob.getName() + " for " + a );
            System.out.println(Bob.getName()+ " attacks " + Joe.getName() + " for " + b);            
            
            if (Bob.getCurrentLife() <= 0 && Joe.getCurrentLife() <= 0){
                Print2Life();
                System.out.println("Draw");                
            }
            else if (Bob.getCurrentLife() <= 0){
                Print2Life();
                System.out.println("Joe wins");                
            }            
            else if (Joe.getCurrentLife () <= 0){
                Print2Life();
                System.out.println("Bob wins");                
            }        
        }    
    }
    public void Print2Life(){
            System.out.println(Joe.getName()+ ": " +Joe.getCurrentLife());
            System.out.println(Bob.getName()+ ": " + Bob.getCurrentLife());
    }
   
}
