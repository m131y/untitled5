public class Main {
    public static void main(String[] args) {
        String message = "Hello, Java!";

        for (int i = 0; i < message.length(); i++) {
            System.out.println(i);
            if (message.charAt(i) == 'l') {
                break;
            }
        }
    }
}