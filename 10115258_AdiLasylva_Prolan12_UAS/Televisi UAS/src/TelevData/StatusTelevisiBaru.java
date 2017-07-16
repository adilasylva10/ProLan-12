
package televdata;

import data.DataToko;


public class StatusTelevisiBaru implements DataToko{
   String kodebarang,merk, type, ukuran, garansi;
   int harga;
    
    public void setKodebarang(String l){
        kodebarang=l;
    }
    public String getKodebarang(){
        return kodebarang;
    }
    public void setMerk(String l){
        merk=l;
    }
    public String getMerk(){
        return merk;
    } 
    public void setHarga(int l){
        harga=l;
    }
    public int getHarga(){
        return harga;
    }
     public void setType(String l){
        type=l;
    }
    public String getType(){
        return type;
    }
    public void setUkuran(String l){
        ukuran=l;
    }
    public String getUkuran(){
        return ukuran;
    }
    public void setGaransi(String l){
        garansi=l;
    }
    public String getGaransi(){
        return garansi;
    }
    

    @Override
    public void tampiljudul() {
       System.out.println("\n================== Daftar Televisi ===================");
    }

    @Override
    public void tampildaftar() {
        System.out.println("Kode Barang     : " + getKodebarang());
        System.out.println("Merk            : " + getMerk());
        System.out.println("Harga           : " + getHarga());
        System.out.println("Type            : " + getType());
        System.out.println("Ukuran          : " + getUkuran());
        System.out.println("Garansi         : " + getGaransi());

    }

    @Override
    public void tampilBaris() {
        System.out.println("==================================================");
    }

}


