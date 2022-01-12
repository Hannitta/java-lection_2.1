public class main {
    public static void main(String[] args) {

        int startAccount = 100;
        int depositAmount = 1100;
        int bonusCount = 0;
        int totalSum;

        if (depositAmount > 1000) {
            bonusCount = depositAmount / 100;
        }
        totalSum = startAccount + depositAmount + bonusCount;

        System.out.println("Ваш итоговый счёт: " + totalSum);
        System.out.println("У Вас " + bonusCount + " бонусных рублей");

    }
}
