import java.util.Scanner;

public class Lingkaran30{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        float phi;
        double keliling, luas;

        System.out.print("Masukkan jari-jari lingkaran : ");
        r = input.nextInt();

        phi = 3.14f;
        keliling = 2*phi*r;
        luas = phi*r*r;
        System.out.println("Jadi Keliling dan Luas Lingkaran adalah");
        System.out.println("Keliling : " + (int) keliling);
        System.out.println("Luas : "+ (int) luas);
    }
}