
package TelevData;


public class Status2 extends StatusTelevisi{
     void TampilDataJual(){
	System.out.println("Tampilan Data Penjualan");
	System.out.println("***********************");
	}
    public void DataTvPembeli(){
        
        StatusTelevisi minne = new StatusTelevisi();
        System.out.println("Nama Barang    :"+minne.getMerk());
        System.out.println("Harga Barang   :"+minne.getHarga());
        System.out.println("Ukuran         :"+minne.getUkuran());
        System.out.println("Type Barang    :"+minne.getType());
        System.out.println("Garansi Barang :"+minne.getGaransi());
        System.out.println("\n\n");
	}
    public void DataTvJual(){
        TampilDataJual();
        StatusTelevisi minne = new StatusTelevisi();
        System.out.println("Nama Pembeli   :"+minne.getNama());
        System.out.println("Alamat Pembeli :"+minne.getAlamat() );
        System.out.println("No HP          :"+minne.getKontak());
        System.out.println("Nama Barang    :"+minne.getMerk());
	System.out.println("Type Barang    :"+minne.getType());
	System.out.println("Ukuran         :"+minne.getUkuran());
	System.out.println("Garansi Barang :"+minne.getGaransi());
	System.out.println("Harga Barang   :"+minne.getHarga());
        System.out.println("\n\n");
    }
}
