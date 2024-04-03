import java.util.Scanner;

class Main {

    public static String croche(int element, int n) {
        if (n == 0)
            return String.valueOf(element);
        else
            return "[" + croche(element, n - 1) + "]";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(croche(element, n));
    }
}
