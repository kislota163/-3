public class Main {
    public static void main(String[] args) {
        int sum = 1547;
        int con = 1000;
        int bonus = 0;
        if (sum < con) {
            System.out.println("Бонус:" + (bonus));
        } else {
            bonus = (sum / 100);
            System.out.println("Бонус:" + (bonus));
        }
    }
}
