package frontend;

import java.time.LocalDate;
import java.util.Scanner;

import entity.Group;

public class Exercise4_String {
	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		System.out.println("Mời ban chọn câu hỏi: ");
		System.out.println("Nhập vào số 1 để thực hiện Question1:");
		System.out.println("Nhập vào số 2 để thực hiện Question2:");
		System.out.println("Nhập vào số 3 để thực hiện Question3:");
		System.out.println("Nhập vào số 4 để thực hiện Question4:");
		System.out.println("Nhập vào số 5 để thực hiện Question5:");
		System.out.println("Nhập vào số 6 để thực hiện Question6:");
		System.out.println("Nhập vào số 7 để thực hiện Question7:");
		System.out.println("Nhập vào số 8 để thực hiện Question8:");
		System.out.println("Nhập vào số 9 để thực hiện Question9:");
		System.out.println("Nhập vào số 10 để thực hiện Question10:");
		System.out.println("Nhập vào số 11 để thực hiện Question11:");
		int choose = sc.nextInt();
		switch (choose) {
		case 1:
			question1();
			break;
		case 2:
			question2();
			break;
		case 3:
			question3();
			break;
		case 4:
			question4();
			break;
		case 5:
			question5();
			break;
		case 6:
			question6();
			break;
		case 7:
			question7();
			break;
		case 8:
			question8();
			break;
		case 9:
			question9();
			break;
		case 10:
			question10();
			break;
		case 11:
			question11();
			break;

		default:
			break;
		}

	}

//	Question 11 (Optional): Count special Character
//	Tìm số lần xuất hiện ký tự "a" trong chuỗi
	private static void question11() {
		// TODO Auto-generated method stub

	}

//	Question 10 (Optional):
//		Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//		Nếu có xuất ra “OK” ngược lại “KO”.
//		Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
	private static void question10() {
		System.out.println("Kiểm tra 2 chuỗi có là đảo ngược của nhau không: ");

	}

//	Question 9:
//		In ra tất cả các group "Java"
	private static void question9() {
		System.out.println("In ra các group Java");
		// Tạo ra 1 mảng 
		String[] groupname = {"Java", "C++", "PHP", "Python"};
		for (String name : groupname) {
			if (name.equals("Java")) {
				System.out.println("Goup Java: " + name);
			}
		}

	}

//	Question 8:
//		In ra tất cả các group có chứa chữ "Java"
	private static void question8() {
		System.out.println("In ra các group có chứa chữ Java: ");
		// Khai báo 1 group:
		String[] groupname = {"Group Java", "Java Web Fullstack", "Học lập trình Java", "Học Lập trình PHP"};
		for (String name : groupname) {
			if (name.contains("Java")) {
				System.out.println("Group có chứa chữ Java là: " + name);
			}
		}

	}

//	Question 7:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//		chuẩn hóa họ và tên của họ như sau:
//		a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập
//		vào
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//		chuẩn hóa thành "nguyễn văn nam"
//		b) Viết hoa chữ cái mỗi từ của người dùng
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//		chuẩn hóa thành "Nguyễn Văn Nam"
	private static void question7() {
		System.out.println("Nhập vào họ tên người dùng đầy đủ và chuẩn hoá tên của họ: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào họ tên của bạn: ");
		String hoten = sc.nextLine().trim();
		// trả về 1 chuỗi phù hợp với regex
		hoten = hoten.replaceAll("\\s", " ");
		System.out.println("test họ tên: " + hoten);
		// Tạo 1 mảng chứa họ tên ngăn cách bởi các khoảng trắng.
		String[] words = hoten.split(" ");
		hoten = "";
		for (String word : words) {
			String firstCharacter = word.substring(0, 1).toUpperCase();
			String leftCharacter = word.substring(1);
			word = firstCharacter + leftCharacter;
			hoten += word + " ";
		}
		System.out.println("Tên người dùng nhập vào: " + hoten);
		sc.close();
	}

//	Question 6:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//		sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//		VD:
//		Người dùng nhập vào "Nguyễn Văn Nam"
//		Hệ thống sẽ in ra
//		"Họ là: Nguyễn"
//		"Tên đệm là: Văn"
//		"Tên là: Nam"
	private static void question6() {
		System.out.println("Nhập vào họ tên đầy đủ của người dùng sau đó in tách họ tên và tên đệm ra: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào họ tên: ");
		String hoten = sc.nextLine();
		// Cắt những khoảng trắng ở đầu chuỗi và cuối chuỗi
		hoten = hoten.trim();
		// tạo 1 mảng chứa họ tên ngăn cách bằng khoảng trắng:
		String[] word = hoten.split(" ");
		// tên là từ cuối cùng
		String ten = word[word.length - 1];
		// Họ là từ đầu tiên:
		String ho = word[0];
		// tên đệm
		String tendem = "";
		for (int i = 0; i < word.length - 2; i++) {
			tendem += word[i] + " ";
		}
		System.out.println("Họ là: " + ho);
		System.out.println("Tên đệm là: " + tendem);
		System.out.println("Tên là: " + ten);
		sc.close();

	}

//	Question 5:
//		Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
//		dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
	private static void question5() {
		System.out.println("Người dùng nhập vào họ sau đó yêu cầu người dùng nhập vào tên và in ra họ tên: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào Họ: ");
		String ho = sc.nextLine();
		System.out.println("Hãy nhập vào tên của bạn: ");
		String ten = sc.nextLine();
		System.out.println("Họ tên người dùng nhập vào là: " + ho + " " + ten);
		sc.close();

	}

//	Question 4:
//		Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
//		của người dùng ra
//		VD:
//		Người dùng nhập vào "Nam", hệ thống sẽ in ra
//		"Ký tự thứ 1 là: N"
//		"Ký tự thứ 1 là: A"
//		"Ký tự thứ 1 là: M"
	private static void question4() {
		System.out.println("Nhập vào tên vào in ra từng kí tự trong tên người dùng: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		String name = sc.nextLine();
		name = name.toUpperCase();
		for (int i = 0; i < name.length(); i++) {
			System.out.println("Ký tự thứ " + (i + 1) + " là: " + name.charAt(i));
		}
		sc.close();

	}

//	Question 3:
//		Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư
//		viết hoa chữ cái đầu thì viết hoa lên
	@SuppressWarnings("resource")
	private static void question3() {
		System.out.println("Viết chương trình nhập tên và kiểm tra, viết hoa chữ cái đầu tiên: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên: ");
		String name = sc.next();
		String firstCharacter = name.substring(0, 1).toUpperCase();
		String leftCharacter = name.substring(1);
		String name1 = firstCharacter.concat(leftCharacter);
		System.out.println("Tên người dùng nhập vào: " + name1);

	}

//	Question 2:
//		Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
	@SuppressWarnings("resource")
	private static void question2() {
		System.out.println("Nhập 2 sâu kí tự và nối 2 chuỗi: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi 1: ");
		String s1 = sc.nextLine();
		System.out.println("Nhập chuỗi 2: ");
		String s2 = sc.nextLine();
		System.out.println("Nối 2 chuỗi: ");
		String s = s1.concat(s2);
		System.out.println("Chuỗi kí tự sau khi nối là: " + s);

	}

//	Question 1:
//		Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//		thể cách nhau bằng nhiều khoảng trắng );
	@SuppressWarnings("resource")
	private static void question1() {
		System.out.println("Question 1: Nhập 1 sâu kí tự và đếm số lượng trong sâu kí tự đó");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		String a = sc.nextLine();
		String[] word = a.split(" ");
		System.out.println("Số kí tự: " + word.length);

	}

}
