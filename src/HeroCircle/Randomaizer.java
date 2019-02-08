package HeroCircle;

import java.util.Random;

public class Randomaizer {
    public static int RandPower(int low,int high){
        Random r = new Random();
        return r.nextInt(high-low) + low;
    }
}
