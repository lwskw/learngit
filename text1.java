package hello;


public class text1 {
    public static void main(String[] args) {

        int i;
        int j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                int m = i*j;
                System.out.println(j + "*" + i + "=" + m);
            }
        }


    }
}
