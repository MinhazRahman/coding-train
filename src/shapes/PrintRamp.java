package shapes;

/** n = 3
 *   0 1 2 3
 * 0 - - - *
 * 1 - - * *
 * 2 - * * *
 * 3 * * * *
 * */
public class PrintRamp {

    //build a ramp
    public  static  void buildRamp(int n){
        for(int i = 0; i < n; i++){
            String str = "";
            for(int j = i; j < n -1; j++){
                str += "-";
            }
            for (int k = 0; k <= i; k++){
                str += "*";
            }

            System.out.println(str);
        }
    }

    public static void main(String[] args) {

        buildRamp(4);
    }
}
