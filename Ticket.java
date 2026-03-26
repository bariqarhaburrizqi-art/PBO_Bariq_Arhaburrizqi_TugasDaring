/*
Nama    : Bariq Arhaburrizqi, NIM  : 2501083019
Desk    : Membuat program untuk mencari harga tiket
 */
package TugasDaring;
import java.util.Scanner;
public class Ticket {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kelas, tujuan, harga = 0, tiket, total;
        double diskon = 0, bayar;
        
        System.out.println("Tabel harga tiket bus");
        System.out.print("Tujuan =\n1.Jakarta\n2.Yogya\n3.Surabaya\n");
        System.out.print("Kelas =\n1.Eksekutif\n2.Bisnis\n3.Ekonomis\n");
        
        System.out.print("Masukan Tujuan Anda (1/2/3) = ");
        tujuan = input.nextInt();
        System.out.print("Masukan Kelas Anda (1/2/3) = ");
        kelas = input.nextInt();
        System.out.print("Masukan Jumlah Tiket \t= ");
        tiket = input.nextInt();
        
        switch(tujuan)
        {
            case 1 :    
                        switch (kelas)
                        {
                            case 1 : harga = 70000;break;
                            case 2 : harga = 40000;break;
                            case 3 : harga = 10000;break;
                            default : System.out.println("masukkan kelas yang valid!!");
                        }break;
            case 2 :    switch (kelas){
                            case 1 : harga = 80000;break;
                            case 2 : harga = 50000;break;
                            case 3 : harga = 20000;break;
                            default : System.out.println("masukkan kelas yang valid!!");
                        }break;
            case 3 :    switch (kelas){
                            case 1 : harga = 90000;break;
                            case 2 : harga = 60000;break;
                            case 3 : harga = 30000;break;
                            default : System.out.println("masukkan kelas yang valid!!");
                        }break;
            default : System.out.println("Masukkan tujuan yang valid!!");
        }
        
        total = harga * tiket;
        
        if(tujuan == 3 && kelas == 1 && tiket >=4 || tujuan==2 && kelas==3 && tiket>=4)
        {
            diskon = total * 0.1;
        }
        
        bayar =total - diskon;
        System.out.println("Harga Tiket \t\t= "+harga);
        System.out.println("Total Harga \t\t= "+total);
        System.out.println("Diskon \t\t\t= "+diskon);
        System.out.println("Total yang harus dibayar = "+bayar);
    }
}