
package TelevData;


public class StatusTelevisi implements DataTelevisi{
private int harga;
private String merk;
private String type;
private String ukuran;
private String garansi;
protected String kontak;
protected  String alamat;
protected String nama;

   
public int getHarga(){
    return harga;

}
public void setHarga(int harga){
    this.harga = harga;
}

public String getMerk(){
    return merk;
    
}

public void setMerk(String merk){
    this.merk = merk;
} 
public String getType(){
    return type;
    
}

public void setType(String type){
    this.type = type;
}
public String getUkuran(){
    return ukuran;
    
}

public void setUkuran(String ukuran){
    this.ukuran = ukuran;
} 
public String getGaransi(){
    return garansi;
    
}

public void setGaransi(String garansi){
    this.garansi = garansi;
       
}
public String getKontak(){
    return kontak;
    
}

public void setKontak(String kontak){
    this.kontak = kontak;
       
}
public String getNama(){
    return nama;
    
}

public void setNama(String nama){
    this.nama = nama;
       
}
public String getAlamat(){
    return alamat;
    
}

public void setAlamat(String alamat){
    this.alamat = alamat;
       
}

    @Override
    public void harga() {
        System.out.println(getHarga());
    }

    @Override
    public void merk() {
        System.out.println(getMerk());
    }

    @Override
    public void type() {
        System.out.println(getType());
    }

    @Override
    public void ukuran() {
        System.out.println(getUkuran());
    }

    @Override
    public void garansi() {
        System.out.println(getGaransi());
    }


        void DataPembeli(){
	System.out.println("Tampilan Data Pembelian");
	System.out.println("***********************");
	}
    
}