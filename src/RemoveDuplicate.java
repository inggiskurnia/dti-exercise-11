import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
    public static ArrayList run(ArrayList<Integer> a) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> unique = new HashSet<>();

        if (a.size() == 0) {
            return result;
        }

        for (int i=0; i<a.size(); i++){
            if(!unique.contains(a.get(i))){
                unique.add(a.get(i));
                result.add(a.get(i));
            }
        }

        return result;
    }
}
