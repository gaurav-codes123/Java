import java.util.Arrays;

public class Consecutive {
    public static void main(String[] args){
        int[] b = {6,12, 13, 9, 10, 14,15};
        Arrays.sort(b);
        int highestStreak = 0;
        int currentStreak = 0;

        for (int i = 0; i < b.length - 1; i++) {
            if (b[i] == b[i + 1] - 1) {
                currentStreak++;
            } else {
                if (currentStreak > highestStreak) {
                    highestStreak = currentStreak;
                    currentStreak = 0;
                }
                
            }
        }

        if (currentStreak > highestStreak) {
            highestStreak = currentStreak;
        }

        System.out.println(highestStreak + 1);
    }
}
