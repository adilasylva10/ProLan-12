
import java.util.Scanner;


public class CalculatorMain {
    public static void main (String [] args){
        double operan1, operan2;
        Calculator cal = new Calculator() {

            @Override
            protected double hasilTambah(double x, double y) {
               
               return x + y; 
            }

            @Override
            protected double hasilKurang(double x, double y) {
               return x - y;  
            }

            @Override
            protected double hasilKali(double x, double y) {
               return x * y; 
            }

            @Override
            protected double hasilBagi(double x, double y) {
               return x / y;  
            }
        
            @Override
              protected boolean hasilLebihBesarDari(double x, double y) {
               
               return x > y; 
            }

            @Override
              protected boolean hasilLebihKecilDari(double x, double y) {
               
               return x < y; 
            }

            @Override
              protected boolean hasilLebihBesarSamaDenganDari(double x, double y) {
               
               return x >= y; 
            }

            @Override
              protected boolean hasilLebihKecilSamaDenganDari(double x, double y) {
               
               return x <= y; 
            }
        };
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan x : ");
        operan1 = input.nextDouble();
        System.out.print("Masukan y : ");
        operan2 = input.nextDouble();
        
        System.out.print("Hasil Tambah : ");
        System.out.println(cal.hasilTambah(operan1, operan2));
        System.out.print("Hasil Kurang : ");
        System.out.println(cal.hasilKurang(operan1, operan2));
        System.out.print("Hasil Kali : ");
        System.out.println(cal.hasilKali(operan1, operan2));
        System.out.print("Hasil Bagi : ");
        System.out.println(cal.hasilBagi(operan1, operan2));
        
        System.out.println(cal.hasilLebihBesarDari(operan1, operan2));
        System.out.println(cal.hasilLebihKecilDari(operan1, operan2));
        System.out.println(cal.hasilLebihBesarSamaDenganDari(operan1, operan2));
        System.out.println(cal.hasilLebihKecilSamaDenganDari(operan1, operan2));
    }
}
