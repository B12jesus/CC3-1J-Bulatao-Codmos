
package rpg;

import java.util.Scanner;

public class TestDuel {    
    Wizard Harry = new Wizard("Harry",5,6,7);
    Goku Malfoy = new Goku("Malfoy",7,6,4);
    Scanner sc = new Scanner(System.in);
    
        public void Display(){              
        for (int i = 1 ; Harry.getCurrentLife() >= 0 && Malfoy.getCurrentLife () >= 0 ; i++ ){  
            
            
            
            System.out.println("Round " + i);            
            if(i <= 1){
                System.out.println("FIGHT");                
            }
            
            
            int x,a;
            Print2Life();
            
            
            
            
            System.out.println("Choose which attack to use");
            System.out.println(" 1 = Attack \n 2 = Heal \n 3 = Ligthning bolt \n 4 = Weapon");
            x = sc.nextInt();
            
            switch (x) {
                case 1:                    
                    a = Harry.attack();
                    Malfoy.wound(a);
                    System.out.println(Harry.getName()+ " attacks " + Malfoy.getName() + " for " + a );
                    break;   
                case 2:       
                    a=Harry.castHeal();
                    if (a>0){
                    Harry.currentlife = Harry.currentlife + a;
                    System.out.println(Harry.getName()+ "uses heal for " + a );                   
                    break;
                    }
                    else{
                        System.out.println("you dont have enough magic :P");
                        a = Harry.useWeapon();
                        Malfoy.wound(a);
                        System.out.println(Harry.getName()+"attacs "+Malfoy.getName()+" with Weapon for"+a);
                        break;                                
                    }
                case 3: 
                    a=Harry.castLightningBolt();
                    if (a>0){                    
                    Malfoy.wound(a);                   
                    System.out.println(Harry.getName()+ " uses lightningbolt to  " + Malfoy.getName() + " for " + a );
                    break;   
                    }
                    else{
                        System.out.println("you dont have enough magic :P");
                        a = Harry.useWeapon();
                        Malfoy.wound(a);
                        System.out.println(Harry.getName()+"attacks "+Malfoy.getName()+"with weapon for"+a);
                        break;                                
                    }
                case 4:
                    a=Harry.useWeapon();
                    Malfoy.wound(a);
                    System.out.println(Harry.getName()+ " attacks " + Malfoy.getName() + " for " + a );
                    break;
                     
            }
            Print2Life();
            Printwin(); 
            if (Malfoy.getCurrentLife() <= 0 ){
                break;
            }
            
            System.out.println("Malfoy");
            System.out.println("Choose which attack to use");
            System.out.println(" 1 = Attack \n 2 = Kamehameha \n 3 = Genkidama \n 4 = Weapon");
            
            x = sc.nextInt();
            
            switch (x) {
                case 1:                    
                    a = Malfoy.attack();
                    Harry.wound(a);
                    System.out.println(Malfoy.getName()+ " attacks " + Harry.getName() + " for " + a );
                    break;   
                case 2:                                       
                    a=Malfoy.castKamehameha();   
                    if (a>0){                    
                    Harry.wound(a);                   
                    System.out.println(Malfoy.getName()+ " uses Kamehameha to " +Harry.getName()+ "for " + a );
                    break;   
                    }
                    else{
                        System.out.println("you dont have enough magic :P");
                        a = Malfoy.useWeapon();
                        Harry.wound(a);
                        System.out.println(Malfoy.getName()+" attacks "+Harry.getName()+" with Weapon for"+a);
                        break;                                
                    }  
                case 3: 
                    a=Malfoy.castGenkidama();
                    if (a>0){                    
                    Harry.wound(a);                   
                    System.out.println(Malfoy.getName()+ " uses genkudama to " +Harry.getName()+ " for " + a );
                    break;   
                    }
                    else{
                        System.out.println("you dont have enough magic :P");
                        a = Malfoy.useArmor();
                        System.out.println(Malfoy.getName()+"activated armor and healed for "+ a + " due to lack of mana");
                        break;                                
                    }  
                case 4:
                    a=Malfoy.useWeapon();
                    Harry.wound(a);
                    System.out.println(Malfoy.getName()+ " attacks " + Harry.getName() + "with Weapon for " + a );
                    break;  
                    
            }      
                             
            Print2Life();
            Printwin();         
            if (Harry.getCurrentLife() <= 0 ){
                break;
            }
        }   
          
    }
       
        
    public void Print2Life(){
            System.out.println(Harry.getName()+ ": " +Harry.getCurrentLife()+"   Mana: "+Harry.getCurrentmagic());
            System.out.println(Malfoy .getName()+ ": " + Malfoy.getCurrentLife()+"   Mana: "+Malfoy.getCurrentmagic());
    }
    public void Printwin(){
        if (Malfoy.getCurrentLife() <= 0 && Harry.getCurrentLife() <= 0){
                Print2Life();
                System.out.println("Draw");     
                
            }
            else if (Malfoy.getCurrentLife() <= 0){
                Print2Life();
                System.out.println("Harry wins");   
                
            }            
            else if (Harry.getCurrentLife () <= 0){
                Print2Life();
                System.out.println("Malfoy wins");    
            }            
        }  
             
    }
    

    