import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int id = 1;
		
		System.out.println("==시작==");
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			System.out.printf("명령어)");
			
			String cmd = sc.nextLine();
			
			if (cmd.equals("exit")) {
				break;
			}

			if (cmd.equals("article list")) {
				System.out.println("게시글이 없습니다");
			}
			if (cmd.equals("article write")) {
				
				System.out.printf("제목 : ");
				Scanner sc2 = new Scanner(System.in);
				String cmd2 = sc2.nextLine();
				
				System.out.printf("내용 : ");
				Scanner sc3 = new Scanner(System.in);
				String cmd3 = sc3.nextLine();
				
				System.out.println(id + "가 등록되었습니다");
				id += 1;
			
				System.out.println("");
			}
			
		}
		
		sc.close();
		
		
		System.out.println("== 끝 ==");
	}

}
