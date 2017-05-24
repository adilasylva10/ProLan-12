
package TelevData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTelevData extends Status2{

    public static void main(String[] args) throws IOException {
       BufferedReader input= new BufferedReader(new InputStreamReader(System.in)) ;
       String nama = "";
       String alamat = "" ;
       String kontak = "";
       
System.out.print("Nama Pembeli   : ");
nama = input.readLine();
System.out.print("Alamat Pembeli : ");
alamat = input.readLine();
System.out.print("No HP          : ");
kontak = input.readLine();


       StatusTelevisi minne = new StatusTelevisi ();
       minne.setMerk("LG");
       minne.setType("LED");
       minne.setGaransi("2 Tahun");
       minne.setHarga(2000000);
       minne.setUkuran("14 Inchi");
       
       minne.DataPembeli();
        System.out.println("Nama Pembeli   :"+nama);
        System.out.println("Alamat Pembeli :"+alamat);
        System.out.println("No HP          :"+kontak);
        System.out.println("Nama Barang    :"+minne.getMerk());
	System.out.println("Type Barang    :"+minne.getType());
	System.out.println("Ukuran         :"+minne.getUkuran());
	System.out.println("Garansi Barang :"+minne.getGaransi());
	System.out.println("Harga Barang   :"+minne.getHarga());
        System.out.println("============================================\n");
    }
    
}
