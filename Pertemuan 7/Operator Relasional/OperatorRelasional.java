public class OperatorRelasional {
	public static void main (String[]args) {
		byte x=5;
		byte y=4;
		System.out.println("Apakah X sama dengan Y? " +(x==y));
		System.out.println("Apakah X tidak sama dengan Y?" +(x!=y));
		System.out.println("Apakah X lebih besar dari Y? " +(x>y));
		System.out.println("Apakah X kurang dari Y?" +(x<y));
		System.out.println("Apakah X lebih besar dari atau sama dengan Y? " +(x>=y));
		System.out.println("Apakah X lebih kurang dari atau sama dengan Y? " +(x<=y));;
		
		if (x != y){
			System.out.println("X tidak sama dengan Y");
		}	else{
		System.out.println("X sama dengan Y");
	}
	}
}