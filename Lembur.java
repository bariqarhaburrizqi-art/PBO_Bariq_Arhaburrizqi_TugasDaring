/*
NAMA : BARIQ ARHABURRIZQI / NO BP : 2501083019
DESKRIPSI : Menghitung lembur
 */
package TugasDaring;
import java.util.Scanner;
public class Lembur {

   public class LemburKaryawan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam, upah = 0;
        System.out.print("Masukan Jam Lembur Anda = ");
        jam = input.nextInt();
        if(jam <= 20){
            upah = 2000*jam;
        }
        if(jam > 20 && jam <=50){
            upah = 3000*jam;
        }
        if(jam > 50){
            System.out.println("Upah jam lembur hanya hingga 50 jam");
            upah = 3000*50;
        }
          
        System.out.println("Upah Lembur =Rp."+ upah);
        }
    }
}