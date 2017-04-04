public class DataTv{
	String  Serial = "F30";
	String Merk, Tipe, Ukuran, Hadiah, Garansi, Jenis;
	int Harga;
	
	public DataTv(){
		System.out.println("Jenis Televisi");
		System.out.println("--------------");
		System.out.println("A. SUHD TV");
		System.out.println("B. UHD TV");
		System.out.println("C. FullHD TV");
		System.out.println("D. HD TV");
		Jenis="A";
		System.out.println("Jenis televisi yang dipilih = " + Jenis);
		System.out.println("--------------------------------------------------\n");	
	}
	
 void TampilDataTv(){
		System.out.println("Tampilan Data Televisi");
		System.out.println("**********************");	
	}
void DataTv1(String x, String y, String z, String w){
		Merk=x;
		Tipe=y;
		Ukuran=z;
		Garansi=w;
	}
 
void Data1(int j){
		Harga=j;	
	}
 
void Data2(String k){
		Hadiah=k;
	}
}



