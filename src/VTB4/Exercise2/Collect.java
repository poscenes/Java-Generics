package VTB4.Exercise2;

import java.util.ArrayList;
import java.util.Collections;

public class Collect {
    public static <T> ArrayList<T> mutate(T[] arr) {
        ArrayList<T> res = new ArrayList<>(arr.length);
        Collections.addAll(res, arr);
        return res;
    }
}
