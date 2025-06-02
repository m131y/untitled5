public class Main {
    public static void main(String[] args) {
        String mood = "happy";
        // "happy", "angry", "sad", etc.

        switch (mood) {
            case "happy" :
                System.out.println("나는 행복합니다.");
                break;

            case "angry" :
                System.out.println("나는 화났습니다.");
                break;

            default:
                System.out.println("모릅니다.");
        }
    }
}