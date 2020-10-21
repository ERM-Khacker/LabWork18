//4.Проверить работу Java Error
/*• Создать класс StackOverFlowTest
        •  Создать статическое поле int count
        •  Создать статический метод test(), в котором инкрементируется число count,
           выводится его значение на экран и снова вызывается test(). (Рекурсия)
        •  Убедится в наличии ошибки при запуске программы.
        •  Попробовать обернуть содержимое метода в блок try…catch.*/
public class StackOverFlowTest {
    static int count;

    static void test(){
        System.out.println(count++);
        test();
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
