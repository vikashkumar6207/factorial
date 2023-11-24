public class primeFactor {
    public static void main(String[] args) {
        // TC => O(n) -> O(sqrt)
        int n = 29;
        for(int i = 2;i <= n;i++){
            while(n%i == 0){
                System.out.println(i+" ");
                n = n / i;
            }
        }
        if(n > 1){ // if n is prime
            System.out.println(n+" ");
        }
    }
}
