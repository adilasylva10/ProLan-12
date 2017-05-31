
package datatvbaru;

import java.util.Scanner;
public class NewMainCicilan {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
     int lama;
     double hutang,bunga1,bunga,angsur,sisa,sisa1;
     double angsur1,total=0,totbunga,bayar;
     System.out.println("SEPTIAN MAULANA");
     System.out.println("1141177004039");
     System.out.println("*** Tian Chan ***");
     System.out.println();
     System.out.println("       PROGRAM HITUNG ANGSURAN PEMINJAMAN");
     System.out.println("===================================================");
     System.out.print("Besar Pinjaman        = ");hutang=x.nextDouble();
     System.out.print("Lama Angsuran (bulan) = ");lama=x.nextInt();
     System.out.println();
     for(int a=1;a<=lama;a++){
     angsur=hutang/lama;
    sisa=hutang-angsur*a;
    bunga=hutang/(sisa+angsur);
    bunga1=bunga*10/100*hutang; 
    bayar=bunga1+angsur;
    total+=bayar;
    System.out.println("Bulan ke - "+a);
    System.out.println("----------------------------");
    System.out.printf("Suku bunga     = %.2f",bunga);
    System.out.println(" persen");
    System.out.printf("Besar bunga    = %.2f",bunga1);
    System.out.println(" Rupiah");
    System.out.printf("Bayar          = %.2f",bayar);
    System.out.println(" Rupiah");
    System.out.printf("Sisa Pinjaman  = %.2f",sisa);
    System.out.println(" Rupiah");
    System.out.println("----------------------------");
     }
    System.out.println("=============================================================================");
    System.out.println("                                               Pinjaman awal   = "+hutang+" Rupiah");
    System.out.printf ("Total Pengembalian (pinjaman awa1+bunga dari bulan  1 - "+lama+"      = %.2f",total);
    System.out.println(" Rupiah");
    System.out.println();
    }
}
