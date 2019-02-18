package rpg;
public class TestCharacter {      
    
    Character Joe = new Wizard ("Joe",4,5,6);
    Character Bob = new Goku ("Bob",6,6,5);  
    
    public void Display(){  
    
        for (int i = 1 ; Joe.getCurrentLife() >= 0 && Bob.getCurrentLife () >= 0 && i < 3 ; i++ ){
            System.out.println("Round " + i);            
            Print2Life();
            
            int a = Joe.attack();
            Bob.wound(a);
            int b = Bob.attack();
            Joe.wound(b);
            
            System.out.println(Joe.getName()+ " attacks " + Bob.getName() + " for " + a );
            System.out.println(Bob.getName()+ " attacks " + Joe.getName() + " for " + b);   
            
            Printwin();    
        }   
            Printwin();
    }
    public void Print2Life(){
            System.out.println(Joe.getName()+ ": " +Joe.getCurrentLife());
            System.out.println(Bob.getName()+ ": " + Bob.getCurrentLife());
    }
    public void Printwin(){
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

































































/*HI pogi */