public class Main {
    public static void main(String[] args) {
        int num = 25;
        int sq = num * num;
        int temp = num;

        int digiCount = 0;
        while (temp > 0) {
            temp = temp / 10;
            digiCount++;
        }

        int power = (int) Math.pow(10, digiCount);
        if (num == sq % power) {
            System.out.println("Automorphic");
        } else {
            System.out.println("Not Automorphic");
        }
    }
}