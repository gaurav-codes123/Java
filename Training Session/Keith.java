import java.util.ArrayList;

public class Keith {
    public static void main(String[] args) {
        int n = 197;

        if (isKeithNumber(n)) {
            System.out.println(n + " is a Keith number.");
        } else {
            System.out.println(n + " is not a Keith number.");
        }
    }

    public static boolean isKeithNumber(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        int temp = n;

        while (temp > 0) {
            digits.add(0, temp % 10);
            temp /= 10;
        }

        int size = digits.size();

        if (size < 3) {
            return false;
        }

        int nextTerm = 0;

        while (nextTerm < n) {
            nextTerm = 0;

            for (int i = size - 3; i < size; i++) {
                nextTerm += digits.get(i);
            }

            for (int i = 0; i < size - 1; i++) {
                digits.set(i, digits.get(i + 1));
            }
            digits.set(size - 1, nextTerm);
        }

        return nextTerm == n;
    }
}

