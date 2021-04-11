import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfElemnts = sc.nextInt();
        int[] array = new int[numOfElemnts];
        for (int i = 0; i < numOfElemnts; i++) {
            array[i] = sc.nextInt();
        }
        int check1 = 0;
        int check2 = 0;
        for (int i = 0; i < numOfElemnts - 1; i++) {
            check1 = array[i] * array[i + 1];
            if (check1 > check2) {
                check2 = check1;
            }
        }
        System.out.println(check1 > check2 ? check1 : check2);
    }
}