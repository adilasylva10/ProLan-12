class televOOP{
public static void main (String[]args)
{
	//pemanggilan konstruktor                
tv televisiku = new tv("televisiku");
tv2 method = new tv2();
System.out.println("Data Televisi :");
System.out.println("---------------");
System.out.println("Merk Televisi   :"+televisiku.merk);
System.out.println("Tipe Televisi   :"+televisiku.tipe);
System.out.println("Ukuran Televisi :"+televisiku.ukuran);
System.out.println("= = = = = = = = = = = = = = = =\n");

System.out.println("Status Televisi :");
System.out.println("-----------------");
televisiku.menyalakan_tv("ON");
televisiku.ganti_channel();
televisiku.membesarkan_volume("Besar");
televisiku.membesarkan_volume("Kecil");
televisiku.menyalakan_tv("OFF");
System.out.println("= = = = = = = = = = = = = = = =\n");

System.out.println("Data Televisi Method :");
System.out.println("-----------------");
 method.tampil_data_tv("Samsung", "LCD TV");
 method.tampil_data_tv("Samsung", "LCD TV", "32 Inchi");
 
}
}


