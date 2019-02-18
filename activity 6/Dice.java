package rpg;
import java.util.Random;

public class Dice {
    
    private final Random r ;
    
    public Dice(){         
        r= new Random();
    }
    public int roll(){         
            int n = r.nextInt(6)+1;        
        return n;
    }
    public int roll(int x){
        int n =r.nextInt(x)+1;
        return n;
    }
}
