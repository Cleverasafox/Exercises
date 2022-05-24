import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTaskIteration {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(2, 15,
                32, 42, 55, 75, 122, 132, 150, 180, 200));

        for(int i = 0; i<list.size();i++){
            if(list.get(i)>150){
                break;
            }
            if (list.get(i) % 5 == 0)  {
                System.out.println(list.get(i));
            }

        }


    }
}
