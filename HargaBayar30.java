import java.util.Scanner;
public class HargaBayar30{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merk;
        int harga, jumlah, jmlhal;
        double dis, total, bayar, jlmDis;

        System.out.print("Masukkan merk buku yang ingin dibeli : ");
        merk = input.nextLine();
        System.out.print("Masukkan jumlah halaman buku : ");
        jmlhal = input.nextInt();
        System.out.print("Masukkan harga barang yang dibeli : ");
        harga = input.nextInt();
        System.out.print("Masukkan Jumlah barang yang dibeli : ");
        jumlah = input.nextInt();
        System.out.print("Masukkan besaran diskon yang diperoleh : ");
        dis = input.nextDouble();

        total = harga*jumlah;
        jlmDis = total*dis;
        bayar = total-jlmDis;

        System.out.println("Diskon yang anda dapatkan adalah : "+ jlmDis);
        System.out.println("Jumlah yang harus dibayar adalah : " + bayar);

    }
}