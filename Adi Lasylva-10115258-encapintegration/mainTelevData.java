
public class mainTelevData {
    public static void main(String[] args) {
       Status done = new Status();
        done.setMerk("Samsung");
        done.setHarga(25000000);
        done.setTipe("LED");
        done.setUkuran("14 Inchi");
        done.setGaransi("2 tahun");
        
	System.out.println("====================================");
        System.out.println("Bukti Tanda Penjualan Televisi :    ");
	System.out.println("====================================");
	System.out.println("====================================");
        System.out.println("Merk Televisi              : "+done.getMerk());
        System.out.println("Harga Televisi             : "+done.getHarga());
        System.out.println("Type Televisi              : "+done.getType());
        System.out.println("Ukuran Televisi            : "+done.getUkuran());
        System.out.println("Garansi Televisi           : "+done.getGaransi());
        
	System.out.println("====================================");
	System.out.println("====================================");
    
        
}
    
}
