public class StarPattern {

    public static void pattern0(int n) {
        for (int i = 0; i < n; i++) {
            String str = "";
            for (int j = 0; j < n - i; j++) {
                str += "*";
            }
            System.out.println(str);
        }
    }

    public static void patternPyramid(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < (n - i + 1); j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        StarPattern.patternPyramid(n);

    }
}

/*Pattern 0     /*PatternPyramid
 
*****               *
****               ***
***               *****
**               *******
*               *********

*/
