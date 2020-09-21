public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int transfer = 1100;
        int bonus = 0;
        if (transfer >= 1100) {
            bonus = transfer / 100;
        }

        int total_balance = balance + transfer + bonus;
        System.out.println(total_balance);
    }
}