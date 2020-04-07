public class Main {
    public static void main(String[] args) {
        int Balance = 100;
        int Refill = 1538;
        int Bonus;
        if (Refill > 1000) {
            Bonus = Refill / 100;
        } else {
            Bonus = 0;
        }
        int Total = Balance + Refill + Bonus;
        System.out.println(Bonus);
        System.out.println(Total);
    }
}
