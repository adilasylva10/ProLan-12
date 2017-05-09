public class Lasylva extends Mahasiswa {
    
 
     @Override
    public  String ambilNama() {
        return super.ambilNama();
    }

    @Override
    public void tampilNama() {
        System.out.println(ambilNama());
	}
    
    
     @Override
    public String ambilNim() {
        return super.ambilNim();
    }

    @Override
    public void tampilNim() {
        System.out.println(ambilNim());
        }
    
    
    @Override
    public String ambilKelas() {
        return super.ambilKelas();
    }

    @Override
    public void tampilKelas() {
        System.out.println(ambilKelas());
        }
    
    @Override
    public String ambilTahun() {
        return super.ambilTahun();
    }

    @Override
    public void tampilTahun() {
        System.out.println(ambilTahun());
        }
    
    
    @Override
    void kuliah() {
        System.out.println("Kuliah untuk lulus"); 
    }

    @Override
    void lulus() {
        System.out.println("Lulus dengan kuliah "); 
    }

    @Override
    void tidaklulus() {
        System.out.println("Maaf anda belum beruntung, silahkan coba lagi!!!"); 
    }
    
     
}
