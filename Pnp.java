/*
NAMA : BARIQ ARHABURRIZQI / NO BP : 2501083019
DESKRIPSI : Membuat program membuat teks dies natalis atau dekade pnp ke-
 */
package TugasDaring;
import java.util.Scanner;
public class Pnp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, dekade;
        System.out.print("Masukan Umur PNP = ");
        n = input.nextInt();
        if(n % 10 == 0){
            dekade = n / 10;
            System.out.println("Dekade PNP Ke-"+dekade);
        }
        else {
            System.out.println("Dies Natalis PNP Ke-"+n);
        }
    }
}
