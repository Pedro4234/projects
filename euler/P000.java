public class P001 {
    public static void main(String[] args) {
        long total = 0;
        for (long i = 1;i<410000;i = i +2) {
            total = total + (i * i);
        }
        System.out.println(total);
    }
}


