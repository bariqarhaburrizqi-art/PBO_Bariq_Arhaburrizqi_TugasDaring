/*
NAMA : BARIQ ARHABURRIZQI / NO BP : 2501083019
DESKRIPSI : Menghitung Penghasilan Dina
 */
package TugasDaring;
import java.util.Scanner;
public class UangDina {
       public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n, sisa, banyak = 50;
        long upah = 15000, upah_akhir, upah_sisa;
        
        System.out.print("Masukkan jumlah pesanan yang sudah di selesaikan : ");
        n = in.nextInt();
        
        sisa = banyak - n;
        upah_akhir = upah * n;
        upah_sisa = sisa * upah;
        
        System.out.println("Total bayaran Dina saat ini yaitu : Rp. "+upah_akhir+" dengan sisa pesanan : "+sisa);
        System.out.println("Total bayaran sisa Dina : "+ upah_sisa);
       
    }
    
}
