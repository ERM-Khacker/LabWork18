//2. Использование throw
//2.1 Создать класс MoneyTransactionUtil
public class MoneyTransactionUtil {
    private static int bankAccount1;
    private static int bankAccount2;
    protected static int sumAccount1 = 10000;
    protected static int sumAccount2 = 100;

    //2.2 Создать приватный конструктор
    private MoneyTransactionUtil(int bankAccount1, int bankAccount2) {
    }

    public static int getBankAccount1() {
        return bankAccount1;
    }

    public static void setBankAccount1(int bankAccount1) {
        MoneyTransactionUtil.bankAccount1 = bankAccount1;
    }

    public static int getBankAccount2() {
        return bankAccount2;
    }

    public static void setBankAccount2(int bankAccount2) {
        MoneyTransactionUtil.bankAccount2 = bankAccount2;
    }

    //2.3 Создать статический метод для отправки денег с одного счета на другой: sendTo(номерКарты, номерКарты, сумма).
    /*В методе следует обработать несколько возможных исключительных ситуаций:
    • Если номер карты отправителя и карты получателя совпадают, нужно
    выбросить RuntimeException. (throw new RuntimeException())
    • Если сумма является нулевой, отрицательной или больше 100_000,
    нужно выбросить RuntimeException. (throw new RuntimeException())
    Добавить ключевое слово throws и RuntimeException к объявлению метода.
    Если исключительных ситуаций нет, вывести на экран: «Сумма s, со счета n
    успешно переведена на счет m» */
    //3.  В методе MoneyTransactionUtil.sendTo(…) сделать правки:
    //• Если номер карты отправителя и карты получателя совпадают, нужно
    //  выбросить AccountException. (throw new AccountException ())
    //• Если сумма является нулевой, отрицательной или больше 100_000,
    //  нужно выбросить MoneyValueException.
    //• Заменить для throws класс RuntimeException на новые исключения
    public static void sendTo(int account1, int account2, int sum) throws AccountException, MoneyValueException {//RuntimeException
        bankAccount1 = account1;
        bankAccount2 = account2;
        if (account1 == account2) {
            //throw new RuntimeException();
            throw new AccountException();
        } else if (sum <= 0 || sum > 100_000) {
            //throw new RuntimeException();
            throw new MoneyValueException();
        } else if (account1 != 0 && account2 != 0) {
            sumAccount1 = sumAccount1 - sum;
            sumAccount2 += sum;
            System.out.println("Сумма " + sum + ", со счёта " + bankAccount1 + " успешно переведена на счёт " + bankAccount2);
        }
    }
}
