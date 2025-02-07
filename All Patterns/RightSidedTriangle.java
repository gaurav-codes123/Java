public class RightSidedTriangle {
        public static void main(String[] args) {
            int n=5;
            for(int i=1;i<=n;i++){
                for(int j=i;j<=n;j++){
                    System.out.print(" ");// In first iteration 4 spaces 
                }
                // Nested loops working one after another
                for(int j=1;j<=i;j++){
                    System.out.print("*");// In first iteration 1 star

                }
                System.out.println();
            }
        }
        
    }
    

