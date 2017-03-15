public class OperatorAritmatika {
	public static void main (String[]args) {
		byte x=5;
		byte y=4;
		System.out.println("Hasil Pertambahan x dan y adalah " +(x+y));
		System.out.println("Hasil Pengurangan x dan y adalah " +(x-y));
		System.out.println("Hasil Perkalian x dan y adalah " +(x*y));
		System.out.println("Hasil Div x dan y adalah " +(x/y));
		System.out.println("Hasil Mod x dan y adalah " +(x%y));
		
		x++;
		y--;
		System.out.println("Hasil increment x adalah " +x);
		System.out.println("Hasil Increment y adalah " +y);
	}
}