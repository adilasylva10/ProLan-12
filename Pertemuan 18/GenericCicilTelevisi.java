
package televdata;

import data.DataToko;


public class GenericCicilTelevisi <T> implements DataToko{
    T cicil, jumlahcicil , byrcicil;
    String namapenyicil;
    
    public void setnamapenyicil(String namapenyicil){
        this.namapenyicil = namapenyicil;
    }
    public String getnamapenyicil(){
        return namapenyicil;
    }
    public void setjumlahcicil(T jumlahcicil){
        this.jumlahcicil = jumlahcicil;
    }
    public T getjumlahcicil(){
        return jumlahcicil;
    }
    public void jumlahcicil(T jumlahcicil){
        this.jumlahcicil = jumlahcicil;
    }
    public void setbyrcicil(T byrcicil){
        this.byrcicil = byrcicil;
    }
    public T getbyrcicil(){
        return byrcicil;
    }
    public void setcicil(T cicil){
        this.cicil = cicil;
    }
    public T sisacicil(){
        return cicil;
    }
    
    @Override
    public void tampiljudul() {
        System.out.println("\n--------Rincian Cicilan Televisi--------");
    }

    @Override
    
    public void tampildaftar() {
                System.out.println("Nama Penyicil          = " + getnamapenyicil());
		System.out.println("Jumlah Cicilan         = " + getjumlahcicil());
		System.out.println("Cicilan Yang Dibayar   = " + getbyrcicil());
		this.cicil = cicil;
                System.out.println("Sisa Cicilan           = " + sisacicil());
    }

    @Override
    public void tampilBaris() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }

}
