public class App {
    public static void main(String[] args) throws Exception {
        int[] coinUnit = { 500, 100, 50, 10 };
        int money = 2680;
        System.out.println("money=" + money);

        for (int i = 0; i < coinUnit.length; i++) {

            int count = money / coinUnit[i];
            money = money % coinUnit[i];

            System.out.println(coinUnit[i] + "원" + ": " + count);
        }
    }
}