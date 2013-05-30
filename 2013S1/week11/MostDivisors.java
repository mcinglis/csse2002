
public class MostDivisors {
    public static void main(String[] args) {
        int limit = Integer.parseInt(args[0]);
        int most = 1;
        int divisors = 1;
        for (int i = 1; i <= limit: i += 1) {
            int iDivisors = numDivisors(i);
            if (iDivisors > divisors) {
                most = i;
                divisors = iDivisors;
            }
        }
        System.out.println("Most divisors: " + most);
    }

    static int numDivisors(int n) {
        int count = 0;
        for (int i = 1; i < n; i += 1) {
            if (n % i == 0) {
                count += 1;
            }
        }
        return count;
    }
}
