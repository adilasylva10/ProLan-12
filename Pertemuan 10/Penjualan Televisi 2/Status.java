public class Status extends DataTv{
	String KodeJual = "J9092";
	String Bayar, Jenis;
	
	Status(){
		System.out.println(super.Jenis);
		this.Jenis="D";
		System.out.println("Jenis Televisi = " + Jenis);
		
	}
	
void StatusBayar(String h){
		Bayar=h;
	}
	
	@Override
	void TampilDataJual(){
		System.out.println("Tampilan Data Penjualan");
		
		System.out.println("***********************");
	}
	
public void DataTvPembeli(){
		super.TampilDataTv();
		System.out.println("Serial Televisi  = " + super.Serial);		
		System.out.println("Merk Televisi 	 = " + super.Merk);
		System.out.println("Tipe Televisi 	 = " + super.Tipe);	
		System.out.println("Ukuran Televisi  = " + super.Ukuran);	
		System.out.println("Garansi Televisi = " + super.Garansi);	
		System.out.println("Harga Televisi   = " + super.Harga);	
		System.out.println("Hadiah Pembelian = " + super.Hadiah);	
		System.out.println("\n\n");
	}	
public void DataTvPenjual(){
		TampilDataJual();
		
		System.out.println("Kode Penjualan   = " + KodeJual);	
		System.out.println("Merk Televisi 	 = " + super.Merk);	
		System.out.println("Tipe Televisi 	 = " + super.Tipe);	
		System.out.println("Ukuran Televisi  = " + super.Ukuran);	
		System.out.println("Garansi Televisi = " + super.Garansi);	
		System.out.println("Harga Televisi   = " + super.Harga);	
		System.out.println("Hadiah Pembelian = " + super.Hadiah);
		this.StatusBayar("Lunas");
		System.out.println("Tipe Pembayaran  = " + this.Bayar);		
		
		System.out.println("\n");
		
	}
}