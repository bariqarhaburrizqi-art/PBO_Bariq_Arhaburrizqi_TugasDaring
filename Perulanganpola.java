/*
Nama    : Bariq Arhaburrizqi, NIM  : 2501083019
Desk    : Membuat program perulangan berpola
*/
package TugasDaring;

public class Perulanganpola {
    public static void main(String[] args) {
        int n, i, j;
        
        n = 5;
        
        for(i = 1; i<=n; i++){
            for(j=1; j<=n; j++)
                {
                    if(i == 1 || i == n)
                    {
                        System.out.print("0 ");
                    }
                    else if(i == j ){
                        System.out.print("0 ");
                    }
                    else
                    {
                        System.out.print("* ");
                    }
                }
            System.out.println();
        }
    }
}