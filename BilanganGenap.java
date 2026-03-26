/*
 NAMA : BARIQ ARHABURRIZQI / NO BP : 2501083019
DESKRIPSI : Membuat input bilangan
 */
package TugasDaring;
import java.util.Scanner;
public class BilanganGenap {
   
    public static void main(String[] args) {
        int bil;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka Genap = ");
        bil = input.nextInt();
        while(bil % 2 != 0){
            System.out.print("Masukan Angka Genap = ");
            bil = input.nextInt();
        }
        bil = bil + 1;
        System.out.println(bil);
    
    
    
       
    }
    
}
