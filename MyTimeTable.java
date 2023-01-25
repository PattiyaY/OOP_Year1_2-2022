package MyFirstProgram;

public class MyTimeTable {
	
	public static void print_PlusSign() {
		for (int i = 0; i <= 112;i++) {
			System.out.print("+");
		}
	}
	
	public static void main(String[] args) {
	System.out.println("Name : Pattiya Yiadram");	
	System.out.println("ID : 6510359");
	System.out.println("Nickname : Tonkhaw" + "\n");
	for (int i = 0; i <= 112;i++) {
		System.out.print("+");
	}
	
	System.out.println("\n" + "+ Date\\Time\t| 9:00 - 10:30\t| 10:30 - 12:00\t| 12:00 - 13:30\t| 13:30 - 15:00 | 15:00 - 16:30\t| 16:30 - 18:00 +");
	
	print_PlusSign();
	
	System.out.print("\n" + "+ Monday\t| \t\t| \t\t|  ELE1001(414) | \t\t| \t\t| \t\t|" + "\n");
	
	print_PlusSign();
	
	System.out.print("\n" + "+ Tuesday\t| \t\t|  BBA1001(409)\t|  ELE1001(414) | \t  IBE1122(402)\t\t| \t\t|" + "\n");
	
	print_PlusSign();
	
	System.out.print("\n" + "+ Wednesday\t|\t\t|\t\t|\t\t| \t  BG14032(421)\t\t| \t\t|" + "\n");
	
	print_PlusSign();
	
	System.out.print("\n" + "+ Thursday\t|  BBA1001(409)\t| \t\t|  ELE1001(414) | \t  CSX3002(543)\t\t| \t\t|" + "\n");
	
	print_PlusSign();
	
	System.out.print("\n" + "+ Friday\t| \t   ITX4502(542)\t\t|  ELE1001(414) | \t  ITX2005(542)\t\t| \t\t|" + "\n");
	
	print_PlusSign();
	
	}

}
