
package datatvbaru;

import java.util.Scanner;

public class NewMainDiskon {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

int harga, jumlah, total = 0;
int potongan1, potongan2, potongan3;

System.out.print ("Masukkan Harga Barang : Rp ");
harga = input.nextInt();
System.out.print ("Jumlah Barang : ");
jumlah = input.nextInt();
total = harga*jumlah;
System.out.println("Total Bayar : Rp "+ total);
potongan1 = (total - ((total*5)/100));
potongan2 = (total - ((total*10)/100));
potongan3 = (total - ((total*15)/100));

if(total >= 200000){
System.out.println("Total Bayar (Diskon 15%) : Rp "+ potongan3);
}else if(total >= 100000 ){
System.out.println("Total Bayar (Diskon 10%) : Rp "+ potongan2);
}else if(total >= 50000){
System.out.println("Total Bayar (Diskon 5%) : Rp "+ potongan1);
}
    }
}

        

