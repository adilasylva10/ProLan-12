class televOOP{
public static void main (String[]args)
{
tv televisiku = new tv ("televisiku");
televisiku.merk="Samsung";
System.out.println("Merk Televisi :"+televisiku.merk);
televisiku.tipe="LCD TV";
System.out.println("Tipe Televisi :"+televisiku.tipe);
televisiku.ukuran="32 Inchi";
System.out.println("Ukuran Televisi :"+televisiku.ukuran);
televisiku.menyalakan_tv("ON");
televisiku.ganti_channel();
televisiku.membesarkan_volume("Besar");
televisiku.membesarkan_volume("Kecil");
televisiku.menyalakan_tv("OFF");
}
}