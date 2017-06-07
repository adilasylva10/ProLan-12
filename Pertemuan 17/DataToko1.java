package lasylva;
//Spint Task Pertama
public class DataToko1 {
     public <Y> void NoSerial(Y o){
        System.out.println("Merk Televisi                :"+o);
    }
    public <L> void MerkBarang(L h){
        System.out.println("Merk Televisi                :"+h);
    }
     public <R> void Harga(R j){
        System.out.println("Harga                        :"+j);
    }
     public <L,R> void Jumlah(L j, R w){
        System.out.println("Stock Televisi yang ada      :"+j);
        System.out.println("Jumlah Televisi yang terjual :"+w);
    }
     
     public static void main(String[]args){
         DataToko1 minne =new DataToko1();
         minne.NoSerial("S123HK");
         minne.MerkBarang("Samsung");
         minne.Harga(2500000);
         minne.Jumlah(25, 1);
     }
}
