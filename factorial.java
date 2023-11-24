class factorial{
    // this file is uploded in github
    public static void main(String[] args) {
        int n = 36;
        int sqrt = (int)Math.sqrt(n);
        for(int i = 1;i <= sqrt;i++){
            if(n%i == 0){
                System.out.println(i);
                if(n/i != i){ 
                System.out.println(n/i+"");
                }
            }
        }
    }
}