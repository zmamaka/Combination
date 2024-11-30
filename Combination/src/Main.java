import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, r, nFac = 1, rFac = 1, nrFac = 1;

        System.out.println("C(n,r)");
        System.out.print("N değerini giriniz => ");
        n = scan.nextInt();

        System.out.print("R değerini giriniz => ");
        r = scan.nextInt();

        for (int i = 1; i <= n; i++)
            nFac *= i;

        for (int i = 1; i <= r; i++)
            rFac *= i;

        for (int i = 1; i <= n - r; i++)
            nrFac *= i;

        System.out.println(nFac / (rFac * nrFac));

    }
}
