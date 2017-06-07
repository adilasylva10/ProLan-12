
package lasylva;
//Spint Task Ketiga

public class MainToko{
   public <G> GenTelevisi Status1 (G status) {
       return (GenTelevisi) status;
   }
   
 public static void main(String[] args) {
   MainToko mrk = new MainToko();
   
   mrk.Status1(new GenTelevisi<>()).Pembeli("Adi Lasylva");
   mrk.Status1(new GenTelevisi<>()).Televisi("Samsung",3500000);
   mrk.Status1(new GenTelevisi<>()).Speaker("Sennheiser",500000); 
        
   }
}
