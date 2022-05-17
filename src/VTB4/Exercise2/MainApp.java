package VTB4.Exercise2;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Integer[] arrInt = {1, 2, 3, 4, 5};
        String[] arr = {"try", "to mutate", "me"};
        ArrayList<String> res;

        res = Collect.mutate(arr);
        System.out.println(res + "\n" + "The type of res: " + res.getClass());
    }
}
