public class tv1
{
   String merk, tipe, ukuran, suara, menyalakan_tv, membesarkan_volume;
    
   //konstruktor
   public tv1()
   {
		this.merk = "Samsung";
		this.tipe="LCD TV";
		this.ukuran="32 Inchi";
		this.menyalakan_tv("ON");
		this.membesarkan_volume("Besar");
		this.membesarkan_volume("Kecil");
		this.menyalakan_tv("OFF");
   }   
}