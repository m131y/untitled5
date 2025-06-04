public class Main {
    public static void main(String[] args) {
        for (int number = 1; number <= 9; number++) {
            System.out.println(number + "단 시작");
            for (int i = 1; i <= 9; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
            System.out.println(number + "단 끝");
        }
    }
}