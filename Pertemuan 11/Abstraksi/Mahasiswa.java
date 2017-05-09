public abstract class Mahasiswa {
  public String nama = "Adi Lasylva";
  public String nim = "10115258";
  public String kelas = "Prolan - 12";
  public String tahun = "2015";
          
  public String ambilNama() {
        return nama;
    }

public abstract void tampilNama();

public String ambilNim() {
        return nim;
    }

public abstract void tampilNim();

public String ambilKelas() {
        return kelas;
    }

public abstract void tampilKelas();

public String ambilTahun() {
        return tahun;
    }

public abstract void tampilTahun();
  
  abstract void kuliah();
  abstract void lulus();
  abstract void tidaklulus();
  
}