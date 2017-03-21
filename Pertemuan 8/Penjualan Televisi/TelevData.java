public class TelevData extends Status{
	String Nama, Alamat, Hp, Tgl;
	
void Pembeli()
{
	System.out.println("Data Pembeli");
	System.out.println("*************");
}
	
void DataBeli(String l, String p, String s, String q)
{
	Nama=l;
	Alamat=p;
	Tgl=s;
	Hp=q;
	Pembeli();
	System.out.println("Nama Pembeli           = " + Nama);
	System.out.println("Alamat Lengkap Pembeli = " + Alamat);
	System.out.println("Tanggal Pembelian      = " + Tgl);
	System.out.println("Nomor Hp Pembeli       = " + Hp);
	System.out.println("\n\n");
}
	
public static void main(String argd[])
{
	
	TelevData Minne = new TelevData();
	Minne.DataTv1("Samsung", "LED", "32 Inchi","1 Tahun");
	Minne.Data1(1500000);
	Minne.Data2("Speaker Aktif");
	Minne.StatusBayar("Lunas");
	Minne.DataBeli("Dini", "Jalan Siti Armilah No.100", "24-10-2016", "082218567908");
	Minne.DataTvPembeli();
	Minne.DataTvPenjual();
	}
}
