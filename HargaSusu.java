/*
Nama    : Bariq Arhaburrizqi, NIM  : 2501083019
Desk    : Membuat program mencari total pembelian, diskon, dan total pembayaran pada suatu swalayan
 */
package TugasDaring;
import java.util.Scanner;
public class HargaSusu {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int merk,banyak;
        long harga, diskon, total_bayar, total_akhir;
        System.out.println("List Susu \n1. Susu A \n2. Susu B \n3. Susu C");
        System.out.print("Masukkan merk susu (1/2/3) : ");
        merk = in.nextInt();
        
        switch(merk)
        {
            case 1 : harga = 40000;
                System.out.print("Masukkan jumlah pembelian anda : ");
                banyak = in.nextInt();
                if (banyak < 3)
                {
                    diskon = 0;
                    total_bayar = banyak * harga;
                    total_akhir = total_bayar - diskon;
                    System.out.println("Total pembelian anda yaitu : Rp. "+total_bayar+ " Dan mendapat diskon sebesar : Rp. "+diskon);
                    System.out.println("Total pembayaran anda menjadi : Rp. "+total_akhir);
                }
                else
                {
                    total_bayar = banyak * harga;
                    diskon = (long) (0.1 * total_bayar);
                    total_akhir = total_bayar - diskon;
                    System.out.println("Total pembelian anda yaitu : Rp. "+total_bayar+ " Dan mendapat diskon sebesar : Rp. "+diskon);
                    System.out.println("Total pembayaran anda menjadi : Rp. "+total_akhir);
                }break;
            case 2 : harga = 50000;
                System.out.print("Masukkan jumlah pembelian anda : ");
                banyak = in.nextInt();
                if (banyak <= 3)
                {
                    diskon = 0;
                    total_bayar = banyak * harga;
                    total_akhir = total_bayar - diskon;
                    System.out.println("Total pembelian anda yaitu : Rp. "+total_bayar+ " Dan mendapat diskon sebesar : Rp. "+diskon);
                    System.out.println("Total pembayaran anda menjadi : Rp. "+total_akhir);
                }
                else
                {
                    total_bayar = banyak * harga;
                    diskon = (long) (0.12 * total_bayar);
                    total_akhir = total_bayar - diskon;
                    System.out.println("Total pembelian anda yaitu : Rp. "+total_bayar+ " Dan mendapat diskon sebesar : Rp. "+diskon);
                    System.out.println("Total pembayaran anda menjadi : Rp. "+total_akhir);
                }break;
            case 3 : harga = 60000;
                System.out.print("Masukkan jumlah pembelian anda : ");
                banyak = in.nextInt();
                diskon = (banyak-1)*(harga-(long)(harga*0.15));
                total_bayar = 60000 + diskon;
                System.out.println("Total pembayaran anda menjadi : Rp. "+total_bayar);
                break;
            default : System.out.println ("Masukkan input yang sesuai");
        }
    }
}