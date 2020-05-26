package shapes;

public class PrintStairs {

    public static void printSteps(int n){

        for(int row = 0; row < n; row++){
            String steps = "";
            for (int col = 0; col < n; col++){
                if(row >= col){
                    steps += "*";
                }
                else {
                    steps += "-";
                }
            }
            System.out.println(steps);
        }
    }
    public static void main(String[] args) {

        printSteps(5);
    }
}
