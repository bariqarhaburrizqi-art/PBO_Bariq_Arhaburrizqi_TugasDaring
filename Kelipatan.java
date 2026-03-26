/*
Nama    : Bariq Arhaburrizqi, NIM  : 2501083019
Desk    : mencari kelipatan 11
 */
package TugasDaring;
import java.util.Scanner;
public class Kelipatan {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, a, b , jumlah, total, rata_rata;
        System.out.print("Masukan Batas Awal = ");
        a = input.nextInt();
        System.out.print("Masukan Batas Akhir = ");
        b = input.nextInt();
        
        jumlah = 0;
        total = 0;
        if(a < b){
            for(i=a; i<=b; i++){
                if(i % 11 == 0 && i % 2 != 0){
                    System.out.print(i+" ");
                    jumlah++;
                    total = total + i;
                }
            }
        }
        else {
            for(i=a; i>=b; i--){
                if(i % 11 == 0 && i % 2 != 0){
                    System.out.print(i+" ");
                    jumlah++;
                    total = total + i;
                }
            }
        }
        rata_rata = total / jumlah;
        System.out.println("\nJumlah angka \t:"+jumlah);
        System.out.println("Total \t\t:"+total);
        System.out.println("Rata-rata \t:"+rata_rata);
    }
}
