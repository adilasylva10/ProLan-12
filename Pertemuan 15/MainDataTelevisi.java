
package TelevData;

import java.util.Scanner;
public class MainDataTelevisi {

    
    public static void main(String[] argd) {
      char menu;
                Barang Tv = new Barang();
                GenericTv<Integer> minne = new GenericTv<>();
                
                System.out.println("====Data Televisi====");
                System.out.println("A. Data Televisi Samsung");
                System.out.println("B. Data Televisi LG");
                System.out.println("C. Data Televisi Polytron");
                System.out.println("D. Data Televisi Sony");
                System.out.println("E. Data Televisi Panasonic");
                System.out.println("F. Data Televisi Sharp");
                System.out.println("G. Data Televisi Toshiba");
                System.out.println("I. Data Harga + Diskon ");
                
                Scanner input = new Scanner (System.in);
                System.out.print("Masukan Menu# ");
                menu = input.next().charAt(0);
                switch (menu){
                               case 'A':
                                    Tv.setMerk("Samsung");
                                    Tv.setKodebarang("S10D15");
                                    Tv.setType("HD TV");
                                    Tv.setHarga(4500000);
                                    Tv.setukuran("70 Inchi");
                                    Tv.setGaransi("1 Tahun");
                                    
                                    Tv.tampiljudul();
                                    Tv.Note();
                                    Tv.tampildaftar();
                                    Tv.tampilBaris();
                                    break;
                               case 'B':
                                    Tv.setMerk("LG");
                                    Tv.setKodebarang("L45G09");
                                    Tv.setType("LED");
                                    Tv.setHarga(3700000);
                                    Tv.setukuran("72 Inchi");
                                    Tv.setGaransi("2 Tahun");
                                    
                                    Tv.tampiljudul();
                                    Tv.Note();
                                    Tv.tampildaftar();
                                    Tv.tampilBaris();
                                    break;
                                case 'C':
                                    Tv.setMerk("Polytron");
                                    Tv.setKodebarang("P89L23");
                                    Tv.setType("4K");
                                    Tv.setHarga(6700000);
                                    Tv.setukuran("70 Inchi");
                                    Tv.setGaransi("3 Tahun");
                                    
                                    Tv.tampiljudul();
                                    Tv.Note();
                                    Tv.tampildaftar();
                                    Tv.tampilBaris();
                                    break;    
                                case 'D':
                                    Tv.setMerk("Sony");
                                    Tv.setKodebarang("Sn24Kl42");
                                    Tv.setType("4K");
                                    Tv.setHarga(11700000);
                                    Tv.setukuran("75 Inchi");
                                    Tv.setGaransi("3 Tahun");
                                    
                                    Tv.tampiljudul();
                                    Tv.Note();
                                    Tv.tampildaftar();
                                    Tv.tampilBaris();
                                    break; 
                                case 'E':
                                    Tv.setMerk("Panasonic");
                                    Tv.setKodebarang("Pc32Nc45");
                                    Tv.setType("LED");
                                    Tv.setHarga(2900000);
                                    Tv.setukuran("71 Inchi");
                                    Tv.setGaransi("2 Tahun");
                                    
                                    Tv.tampiljudul();
                                    Tv.Note();
                                    Tv.tampildaftar();
                                    Tv.tampilBaris();
                                    break; 
                                case 'F':
                                    Tv.setMerk("Sharp");
                                    Tv.setKodebarang("SP334RT978");
                                    Tv.setType("HD tv");
                                    Tv.setHarga(2500000);
                                    Tv.setukuran("70 Inchi");
                                    Tv.setGaransi("1 Tahun");
                                    
                                    Tv.tampiljudul();
                                    Tv.Note();
                                    Tv.tampildaftar();
                                    Tv.tampilBaris();
                                    break; 
                                case 'G':
                                    Tv.setMerk("Toshiba");
                                    Tv.setKodebarang("Ta128H571");
                                    Tv.setType("HD Tv");
                                    Tv.setHarga(3000000);
                                    Tv.setukuran("75 Inchi");
                                    Tv.setGaransi("3 Tahun");
                                    
                                    Tv.tampiljudul();
                                    Tv.Note();
                                    Tv.tampildaftar();
                                    Tv.tampilBaris();
                                    break;
                                case 'I': 
                                    minne.setKodebarang(input.nextLine());
                                    System.out.print("Kode Barang    = ");
                                    minne.setKodebarang(input.nextLine());
                                    System.out.print("Harga Televisi = ");
                                    minne.setHarga(input.nextInt());  
                             
                                    minne.tampiljudul();
                                    minne.tampildaftar();
                                    minne.tampilBaris();
                                    break;
                                    
                }
    }
    
}
