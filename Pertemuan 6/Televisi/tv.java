public class tv {

  //method mengembalikan nilai dengan menggunakan parameter
   public String Tampil_tv(String Nama_tv)
   {
        return Nama_tv;
   }
   
   String merk, tipe, ukuran, suara, menyalakan_tv, membesarkan_volume;
   //konstruktor
   public tv (String televisi){
   System.out.println("Objek" +televisi+ "dari kelas tv sudah dibuat \n");
   }
   public void menyalakan_tv(String power){
   System.out.println("Televisi sudah :" +power);
   }
   public void ganti_channel(){
   System.out.println("Channel sudah diubah");
   }
   public void membesarkan_volume(String suara){
   System.out.println("Volume sudah di"+suara+"kan");
	   
		this.merk = "Samsung";
		this.tipe="LCD TV";
		this.ukuran="32 Inchi";
		this.menyalakan_tv("ON");
		this.membesarkan_volume("Besar");
		this.membesarkan_volume("Kecil");
		this.menyalakan_tv("OFF");
   }    

//overloading
void tampil_data_tv(String merk, String tipe )
{
	System.out.println("Merk tv  	: " +merk);
	System.out.println("Jenis tv    : " +tipe);
	System.out.println("= = = = = = = = = = = = = = = = = =");
}

void tampil_data_tv(String merk, String tipe, String ukuran)
{
	System.out.println("Merk tv  	: " +merk);
	System.out.println("Jenis tv    : " +tipe);
	System.out.println("Ukuran Tv   : " +ukuran);
	
	
	System.out.println("= = = = = = = = = = = = = = = = = =");
	
}
}
