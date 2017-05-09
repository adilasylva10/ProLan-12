public class MainMhs extends Lasylva {
   public static void main (String[] args) {
       Lasylva Minne = new Lasylva();
       
       System.out.print("Nama Anda        :      "); Minne.tampilNama();
       System.out.print("NIM Anda         :      "); Minne.tampilNim();
       System.out.print("Kelas Anda       :      "); Minne.tampilKelas();
       System.out.print("Tahun masuk anda :      "); Minne.tampilTahun();
       System.out.println("==========================================\n");
       System.out.println("Ket : ");
       
       
       
       Minne.kuliah();
       Minne.lulus();
       Minne.tidaklulus();
      
       }
}