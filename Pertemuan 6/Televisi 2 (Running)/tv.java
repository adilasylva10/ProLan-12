public class tv {
String merk, tipe, ukuran, tombol_volume, tombol_channel;

//konstruktor 
public tv (String televisi){
System.out.println("Objek " +televisi+ " dari kelas tv sudah dibuat \n");
		this.merk = "Samsung";
		this.tipe="LCD TV";
		this.ukuran="32 Inchi";
}
public void menyalakan_tv(String power){
System.out.println("Televisi sudah :" +power);
}
public void ganti_channel(){
System.out.println("Channel sudah diubah");
}
public void membesarkan_volume(String suara){
System.out.println("Volume sudah di"+suara+"kan");
}
    
}
