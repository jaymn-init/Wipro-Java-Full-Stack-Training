interface I1 {
    void sum();
}

class I2 {
    void sum() {
        System.out.println("Class");

    }
}

public class newWorld extends I2 implements I1 {
    newWorld() {
        super();
    }

    public void sum() {
        System.out.println("Interfface");

    }

    public static int simpleInterest() {
        int res = 1;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            res *= (sc.nextInt());
        }
        return res / 100;

    }

    public static double areaCircle() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int r = sc.nextInt();
        return (r * 3.14 * r);
    }

    public static String checkEvenOdd() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int r = sc.nextInt();
        if (r % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    public static void universalTable() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(r + " x " + i + " = " + (r * i));
        }
    }

    public static void vowel(char c) {
        switch (c) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'i':
            case 'I':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }

    // System.out.println(simpleInterest());
    // System.out.println(areaCircle());
    // System.out.println(checkEvenOdd());
    // universalTable();
    // vowel(args[0].charAt(0)); System.out.println((int) 'A');
    public static void main(String args[]) {
        newWorld n = new newWorld();
        super.sum();
    }

}
