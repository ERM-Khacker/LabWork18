//1.Создать класс ArrayExceptionTest
public class ArrayExceptionTest {
    //2.Создать main метод
    public static void main(String[] args) {
        //3.Создать и проинициализировать произвольный массив из 5-6 элементов.
        int[] arr = {120, 110, 100, 1505, 2000};
        //6.Вызвать несколько раз (с разными значениями) метод printArray в методе main для созданного ранее массива
        printArray(arr, 0, 4);
        printArray(arr, 2, 4);
        printArray(arr, 3, 6);
    }

    //4.Создать статический метод printArray(array, start, end), который выводит на
    //экран элементы массива от индекса start до индекса end
    private static void printArray(int[] array, int start, int end) {
        //5.Добавить обработку исключения ArrayIndexOutOfBoundsException, для
        //операции получения элемента массива по индексу
        try {
            for (int i = start; i < end + 1; i++) {
                System.out.println(array[i]);
            }
            System.out.println(start + " до " + end);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println(ex);
        }
    }
}
