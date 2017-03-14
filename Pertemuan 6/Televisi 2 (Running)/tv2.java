class tv2{

//method mengembalikan nilai dengan menggunakan parameter
   public String Tampil_tv(String Nama_tv)
   {
        return Nama_tv;
   }
//overloading
void tampil_data_tv(String merk, String tipe )
{
	
	System.out.println("Merk Televisi 	:" +merk);
	System.out.println("Tipe Televisi 	:" +tipe);
	System.out.println("= = = = = = = = = = = = = = = = = =");
}

void tampil_data_tv(String merk, String tipe, String ukuran)
{
	
	System.out.println("Merk Televisi 	:" +merk);
	System.out.println("Tipe Televisi 	:" +tipe);
	System.out.println("Ukuran Televisi :" +ukuran);
	System.out.println("= = = = = = = = = = = = = = = = = =");
	
}

}