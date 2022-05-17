package VTB4.Exercise1;

public class Generics {
    public static <T> void replace(T[] arr, int firstIndex, int secondIndex) {
        T tmp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tmp;
    }
}
