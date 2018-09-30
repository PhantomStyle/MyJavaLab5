package app.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    public List<Integer> listOfGeneratedIndexes(int amount){
        int tenPercentsFromTotalAmount = (int)((double)amount/10);
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int i = 0;
        while(i != tenPercentsFromTotalAmount) {
            int randomIndex = random.nextInt(amount);
            if (!list.contains(randomIndex)) {
                list.add(randomIndex);
                i++;
            }
        }
        return list;
    }
}
