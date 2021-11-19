public class Principal {
    public static void main(String[] args) {
        System.out.println(counttingValleys(8, "DDUUUUDD"));
        System.out.println(counttingValleys(8, "UDDDUDUU"));
    }

    public static int counttingValleys(int steps, String path) {
        int upDown = 0;
        int valley = 0;
        char[] letters = path.toCharArray();
        for (int i = 0; i < steps; i++) {
            if (letters[i] == 'U') ++upDown;
            if (letters[i] == 'D') --upDown;

            if (upDown == 0 && letters[i] == 'U') ++valley;
        }
        return valley;
    }

}
