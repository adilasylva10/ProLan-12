import java.util.Scanner;
class IPMahasiswa
{
	 public static void main(String[] args) 
    {
		IPMahasiswa ipmhs = new IPMahasiswa();
		
		Scanner input = new Scanner (System.in);
		float IP;
		float JumIp = 0;
		int jmlMhs =0, MhsLls = 0, TdkLls = 0, IpAbaikan = 0;
		
		System.out.print("Masukan Nilai IP: ");
        IP = input.nextFloat();
		
		while (IP != -999)
		{
			if (ipmhs.isWithinRange(IP, 0, 4) == 1){
				jmlMhs++;
			} else {
				IpAbaikan++;
			} 
			if (IP >= 2.75){
				MhsLls++;
			} 
			if (IP >= 0 && IP <= 2.75){
				TdkLls++;
			}
				if( IP>=0 && IP <=4)
			{
				JumIp=JumIp+IP;
			} else {
				System.out.println("Tidak ada data!");
			}
			System.out.print("Masukan Nilai IP: ");
			IP = input.nextFloat();
				
			
		}
				
		System.out.println("Jumlah  Mahasiswa: " + jmlMhs);
		System.out.println("Jumlah  IP yang diabaikan: " + IpAbaikan);
		System.out.println("Jumlah  Mahasiswa lulus adalah: " + MhsLls);
		System.out.println("Jumlah  Mahasiswa tidak lulus adalah: " + TdkLls);
		System.out.println("IP  Rata-rata: " +ipmhs.Rata_rata(JumIp, jmlMhs));
    }	
	
	int isWithinRange(float X, int min, int max)
	{
		if (X >= min && X <= max)
		{
			return 1;
		} else {
			return 0;
		}
	}
    

	float Rata_rata(float A, int N)
	{
		return A/N;
	}
}