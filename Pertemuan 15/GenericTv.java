
package TelevData;

public class GenericTv <D> implements DataToko{
   private D bayar, harga;
    String kodebarang;
    float Diskon=10.0f;
    
    public void setKodebarang(String z){
        kodebarang=z;
    }
    public String getKodebarang(){
        return kodebarang;
    }
   public void setHarga(D z){
        harga=z;
    }
    public D getHarga(){
        return harga;
    }
    
    public D membayar (){
        return bayar;
    }
    
            
    
    
    @Override
    public void tampiljudul() {
        System.out.println("\n==================Data Pembayaran Sewa Kamar=================");
    }

    @Override
    public void tampildaftar() {
                System.out.println("Kode Barang     = " + getKodebarang());
		System.out.println("Harga Televisi  = " + getHarga());
		System.out.println("Diskon          = " + Diskon);
                this.bayar= harga;
                System.out.println("Total           = " + membayar());
    }

    @Override
    public void tampilBaris() {
        System.out.println("==============================================================");
    } 
}
