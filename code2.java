
//print the prime numbers from 1-100
public class code2 {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            int prime = 0;
            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    prime = 1;
                    break;
                }
            }

            if (prime == 0)
                System.out.print(i + " ");
        }
    }
}
