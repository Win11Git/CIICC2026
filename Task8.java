public class Task8 {

    static int sum(int... numbers) {
        int total = 0;

        for (int num : numbers) {
            int sum = 0;

            for (int i = 1; i <= num; i++) {
                sum += i;
            }

            total += sum;
        }

        return total;
    }

    public static void main(String[] args) {
        int result = sum(4, 5, 10);

        System.out.println("The total sum is: " + result);
    }
}