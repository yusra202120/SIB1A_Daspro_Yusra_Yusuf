import java.util.Scanner;
public class Gaji30{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji, potGaji;

        System.out.print("Masukkan gaji anda dalam sehari : ");
        gaji= input.nextInt();
        System.out.print("Masukkan potongan gaji anda : ");
        potGaji= input.nextInt();
        System.out.print("Masukkan jumlah hari masuk anda : ");
        jmlMasuk = input.nextInt();
        System.out.print("Masukkan jumlah tidak masuk bekerja anda : ");
        JmlTdkMasuk= input.nextInt();

        TotGaji= (jmlMasuk*gaji) - (JmlTdkMasuk*potGaji);

        System.out.println("Gaji yang anda terima adalah " + TotGaji);
    }
}