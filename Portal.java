/*
Nama    : Bariq Arhaburrizqi, NIM  : 2501083019
Desk    : Membuat program mencari nomor misi yang bisa membuka portal rahasia (kelipatan 3 yang juga kelipatan 4)
 */
package TugasDaring;
import java.util.Scanner;
public class Portal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aw, ak, i;
        System.out.print("Masukan Angka Awal = ");
        aw = input.nextInt();
        System.out.print("Masukan Angka Akhir = ");
        ak = input.nextInt();
        System.out.println("Nomor Misi Untuk Membuka Portal:");
        for(i=aw; i<=ak; i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.print(i+" ");
            }
        }
    }
}