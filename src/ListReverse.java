import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListReverse {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
       List<Integer>listreverse = new ArrayList<>();

        for (int i = list.size()-1;i >= 0;i--){
            listreverse.add(list.get(i));
        }

        System.out.println(listreverse);
    }
}
