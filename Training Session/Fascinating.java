public class Fascinating {
    public static void main(String[] args) {
        int num = 192;
        int b1, b2, b3;

        b1 = num * 1;
        b2 = num * 2;
        b3 = num * 3;

        String answer = String.valueOf(b1) + String.valueOf(b2) + String.valueOf(b3);

        if (isFascinating(answer)) {
            System.out.println(num + " is a fascinating number.");
        } else {
            System.out.println(num + " is not a fascinating number.");
        }
    }

    public static boolean isFascinating(String answer) {
        if (answer.length() != 9) {
            return false;
        }

        for (char digit = '1'; digit <= '9'; digit++) {
            if (answer.indexOf(digit) == -1) {
                return false;
            }
        }

        return true;
    }
}
