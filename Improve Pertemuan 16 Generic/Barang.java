
package datatvbaru;


public class Barang extends DataBarang {

    @Override
    public void tampiljudul() {
        System.out.println("\n================== Data Televisi ===================");
    }

    @Override
    public void tampildaftar() {
        System.out.println("Kode Barang     : " + getKodebarang());
        System.out.println("Merk            : " + getMerk());
        System.out.println("Harga           : " + getHarga());
        System.out.println("Type            : " + getType());
        System.out.println("Ukuran          : " + getUkuran());
        System.out.println("Garansi         : " + getGaransi());
    }

    @Override
    public void tampilBaris() {
        System.out.println("\n====================================================");
    }

    @Override
    protected void Note() {
        System.out.println("Data Barang : ");
    }
    
}