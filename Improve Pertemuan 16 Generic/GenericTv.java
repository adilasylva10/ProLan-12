
package datatvbaru;


public class GenericTv <D> implements DataToko{
    D bayar, harga;
    String merk;
    float disc=0.7f;
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getMerk(){
        return merk;
    }
    public void setHarga(D harga){
        this.harga = harga;
    }
    public D getHarga(){
        return harga;
    }
    public void setBayar(D bayar){
        this.bayar = bayar;
    }
    public D membayar(){
        return bayar;
    }
     
    
    @Override
    public void tampiljudul() {
        System.out.println("\n==================Data Pembayaran Televisi=================");
    }

    @Override
    public void tampildaftar() {
                System.out.println("Jenis Kendaraan = " + getMerk());
		System.out.println("Harga Kendaraan = " + getHarga());
		System.out.println("Diskon Member   = " + disc);
		this.bayar = bayar;
                System.out.println("Total Bayaran   = " + membayar());
    }

    @Override
    public void tampilBaris() {
        System.out.println("==============================================================");
    } 
}
