public class Main {
    public static void main(String[] args) {
        boolean a = true;
        int b = 1;

        while (a) {
            System.out.println(b);
            b++;

            if(b > 100) {
                a = false;
            }
        }

    }
}