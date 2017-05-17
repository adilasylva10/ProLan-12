
public class DataTv2 {
private int harga=1500000;
private String merk="LG";
private String type="LCD";
private String ukuran="16 Inchi";
private String garansi="1 tahun";


public int getHarga(){
    return harga;

}
public void setHarga(int harga){
    this.harga = harga;
}

public String getMerk(){
    return merk;
    
}

public void setMerk(String merk){
    this.merk = merk;
} 
public String getType(){
    return type;
    
}

public void setTipe(String type){
    this.type = type;
}
public String getUkuran(){
    return ukuran;
    
}

public void setUkuran(String ukuran){
    this.ukuran = ukuran;
} 
public String getGaransi(){
    return garansi;
    
}

public void setGaransi(String garansi){
    this.garansi = garansi;
} 
void TampilDataTv(){
		System.out.println("Tampilan Data Televisi");
		System.out.println("**********************");	
	}

}
