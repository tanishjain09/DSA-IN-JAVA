package mathsForDSA.Math;

public class Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];//initially all value in array is false
        sieve(primes,n);
    }
    //false in array is prime
    static void sieve(boolean[] primes,int n){
        for(int i = 2; i*i <= n; i++){
            if(!primes[i]){
                for(int j = i*2 ; j <= n; j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i = 2; i <= n; i++){
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
