package lasylva;
//Spint Task Kedua

public class GenTelevisi <A> {
    
    public void Pembeli(String Pembeli) {
        System.out.println("Nama Pembeli            : " +Pembeli);
    }
    public <T,N> void Televisi (T Merk, N Harga) {
        System.out.println("Merk Televisi           : " +Merk);
        System.out.println("Harga Televisi          : " +Harga);
    }
    public <T,N> void Speaker (T merk, N harga) {
        System.out.println("Merk Speaker            : " +merk);
        System.out.println("Harga Speaker           : " +harga);
    }
    public static void main (String[] args) {
        GenTelevisi minne = new GenTelevisi();
        GenTelevisi <String>  mrk  = new GenTelevisi<>();
        GenTelevisi<Integer> krl = new GenTelevisi<>();
        
        minne.Pembeli("Adi Lasylva");
        mrk.Televisi("Samsung",3500000);
        krl.Speaker("Sennheiser",500000); 
    }
}
