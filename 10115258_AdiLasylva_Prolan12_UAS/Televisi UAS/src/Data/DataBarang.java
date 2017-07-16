
package data;



public abstract class DataBarang implements DataToko{
private int harga;
private String merk;
private String type;
private String ukuran;
private String garansi;
private String kodebarang;

 public String getKodebarang(){
        return kodebarang;
    }
   
    public void setKodebarang(String kodebarang){
        this.kodebarang = kodebarang;
    }
     public String getMerk(){
        return merk;
    }
   
    public void setMerk(String merk){
        this.merk = merk;
    }
    public int getHarga(){
        return harga;
    }
   
    public void setHarga(int harga){
        this.harga = harga;
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
   
    public void setukuran(String ukuran){
        this.ukuran = ukuran;
    }
    public String getGaransi(){
        return garansi;
    }
   
    public void setGaransi(String garansi){
        this.garansi = garansi;
    }
    protected abstract void Note();
}

