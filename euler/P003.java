public class P003 {
    public static void main(String[] args) {
        int lPrimeFactor = 0;

        long num = 600_851_475_143l;
        for (int i = 2; i <= Math.sqrt(num) ;i++) {
            if (num % i == 0) {
                lPrimeFactor = i;
                num = num/i;
                System.out.printf("%d is num%n",num);
                System.out.printf("%d is i %n",i);
            
            }
        }
        System.out.println(num);  
    }
}
