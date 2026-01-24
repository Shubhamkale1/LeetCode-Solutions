package recursion;

public class PrimeOrNot {
//    public static void main(String[] args) {
//        int num = 20;
//        for (int i=1; i<num; i++){
//            System.out.println(i+" "+isPrime(i));
//        }
//    }
//    static boolean isPrime(int num){
//        for (int i=2; i<=Math.sqrt(num); i++){
//            if (num % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
static void sieve(int n) {
    boolean[] isPrime = new boolean[n + 1];

    // Step 1: assume all numbers are prime
    for (int i = 2; i <= n; i++) {
        isPrime[i] = true;
    }

    // Step 2: mark non-primes
    for (int i = 2; i * i <= n; i++) {
        if (isPrime[i]) {
            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
    }

    // Step 3: print primes
    for (int i = 2; i <= n; i++) {
        if (isPrime[i]) {
            System.out.print(i + " ");
        }
    }
}

    public static void main(String[] args) {
        int n = 20;
        sieve(n);
    }
}
