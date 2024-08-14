package app;

public class ArrayUtils {

    @MethodInfo(name = "findMax", returnType = "int", description = "Пошук максимального значення в масиві")
    @Author(firstName = "John", lastName = "Doe")
    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @MethodInfo(name = "findMin", returnType = "int", description = "Пошук мінімального значення в масиві")
    @Author(firstName = "Jane", lastName = "Smith")
    public int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
