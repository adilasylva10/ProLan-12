public class Status extends DataTv2{
    
    void TampilDataJual(){
	System.out.println("Tampilan Data Penjualan");
	System.out.println("***********************");
	}
    public void DataTvPembeli(){
        super.TampilDataTv();
        DataTv2 minne = new DataTv2();
        System.out.println("Nama Barang    :"+minne.getMerk());
        System.out.println("Harga Barang   :"+minne.getHarga());
        System.out.println("Ukuran         :"+minne.getUkuran());
        System.out.println("Type Barang    :"+minne.getType());
        System.out.println("Garansi Barang :"+minne.getGaransi());
        System.out.println("\n\n");
	}
    public void DataTvJual(){
        TampilDataJual();
        DataTv2 minne = new DataTv2();
        System.out.println("Nama Barang    :"+minne.getMerk());
	System.out.println("Type Barang    :"+minne.getType());
	System.out.println("Ukuran         :"+minne.getUkuran());
	System.out.println("Garansi Barang :"+minne.getGaransi());
	System.out.println("Harga Barang   :"+minne.getHarga());
        System.out.println("\n\n");
    }
}