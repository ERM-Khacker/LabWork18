/* • Создать класс UserBank методом main.
   • В методе main вызвать метод sendTo.
   • Обернуть вызов метода блоком try…catch
   • В блоке catch для RuntimeException вывести сообщение: «При обработке
     транзакции банка произошла ошибка»*/
// 3 часть. Проверить отсутствие ошибки в классе UserBank. Т к оба исключения имеют
//   общего предка RuntimeException, они будут обрабатываться без ошибок.
// • Заменить один catch блок с RuntimeException на два: AccountException и MoneyValueException соответственно.
// • При AccountException вывести на экран текст: «Ошибка с реквизитами банка.
//   Возможно, номер карты отправителя и получателя совпадают.»
// • При MoneyValueException вывести на экран текст: «Ошибка с суммой отправки.
//   Сумма должна быть больше 0. Сумма не должна превышать лимит в 100_000».
public class UserBank {
    public static void main(String[] args) {
        try {
            MoneyTransactionUtil.sendTo(123456789, 987654321, 100);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println(MoneyTransactionUtil.sumAccount2); // 200$
        System.out.println(MoneyTransactionUtil.sumAccount1); //9900$
        try {
            MoneyTransactionUtil.sendTo(12345, 12345, 100);
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.err.println("При обработке транзакции банка произошла ошибка");
        }
        try {
            MoneyTransactionUtil.sendTo(123456, 654321, 100_000_0);
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.err.println("При обработке транзакции банка произошла ошибка");
        }
        try {
            MoneyTransactionUtil.sendTo(111,111,-100);
        } catch (AccountException e) {
            e.printStackTrace();
            System.err.println("Ошибка с реквизитами банка. Возможно, номер карты отправителя и получателя совпадают");
        } catch (MoneyValueException e) {
            e.printStackTrace();
            System.err.println("Ошибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна превышать лимит в 100_000");
        }
    }
}
