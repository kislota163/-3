public class miles {
    public static void main(String[] args) {
        int first = 100;
        int sum = 1100;
        int con = 1000;
        int bonus = 0;
        if (sum < con) {
            System.out.println("Бонус:" + (bonus));
            System.out.println("Итоговая сумма: " + (first + sum);
        } else {
            bonus = (sum / 100);
            System.out.println("Бонус:" + (bonus));
            System.out.println("Итоговая сумма: " + (bonus + sum + first));
        }
    }
}
