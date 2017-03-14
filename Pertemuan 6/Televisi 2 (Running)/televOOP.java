class televOOP{
public static void main (String[]args)
{
	//pemanggilan konstruktor                
tv televisiku = new tv("televisiku");

System.out.println("Merk Televisi :"+televisiku.merk);

System.out.println("Tipe Televisi :"+televisiku.tipe);

System.out.println("Ukuran Televisi :"+televisiku.ukuran);

televisiku.menyalakan_tv("ON");
televisiku.ganti_channel();
televisiku.membesarkan_volume("Besar");
televisiku.membesarkan_volume("Kecil");
televisiku.menyalakan_tv("OFF");

}
}


