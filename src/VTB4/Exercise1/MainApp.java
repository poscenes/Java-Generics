package VTB4.Exercise1;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        String[] arr = {"buzz", "fizz", "42", "21", "aoaoaom"};

        System.out.println(Arrays.asList(arr));
        Generics.replace(arr, 1, 3);
        System.out.println(Arrays.asList(arr));
    }
}
