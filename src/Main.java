import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<>();
        array = ArrayLoop();
        System.out.println("Before Sorting : "+array);
        Collections.sort(array);
        System.out.println("Afther Sorting : "+array);

    }

    private static ArrayList<Integer> ArrayLoop() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i<10; i++){
            double number = Math.random()*100;
            arr.add((int) number);
        }
        return arr;
    }
}
