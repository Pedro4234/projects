public class P002 {
    public static void main(String[] args) {
        long total = 0;
        long a = 1; // previous term
        long b = 2; // current term
        long next;
        while (b <4_000_000) {
            if (b % 2 == 0) {
                total = total + b;
                System.out.println(b);
            }
            next = a + b;
            a = b;
            b = next;
            
            
            

        }  
        System.out.println(total); 
        
    }
}
