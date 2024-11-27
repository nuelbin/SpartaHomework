package kiosk.Lv3;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk extends Thread {
    ArrayList<MenuItem> menuList = new ArrayList<>();
    MenuItem chickenKing = new MenuItem("1. 치킨킹(단품)", 6400, "스파이시 통닭다리살과 브리오쉬번이 들어간 치킨버거");
    MenuItem chickenKing2 = new MenuItem("2. 치킨킹(세트)", 8400, "스파이시 통닭다리살과 브리오쉬번이 들어간 치킨버거");
    MenuItem chickenKingBLT = new MenuItem("3. 치킨킹 BLT(단품)", 7400, "스파이시 통닭다리살, 브리오쉬번, 베이컨, 양상추, 토마토가 들어간 치킨버거.");
    MenuItem chickenKingBLT2 = new MenuItem("4. 치킨킹 BLT(세트)", 9000, "스파이시 통닭다리살, 브리오쉬번, 베이컨, 양상추, 토마토가 들어간 치킨버거.");
    Scanner sc = new Scanner(System.in);


    public void run() {

        int choiceNum;

        while (true) {
            System.out.println(" [ BurgerKing 메뉴판 ] ");
            System.out.println("주문하실 메뉴의 번호를 입력해주세요 메뉴판을 종료하시려면 0을 입력해주세요.");
            System.out.println(chickenKing.getDisplay());
            System.out.println(chickenKing2.getDisplay());
            System.out.println(chickenKingBLT.getDisplay());
            System.out.println(chickenKingBLT2.getDisplay());
            System.out.println(" 0. 메뉴판 종료.");

            System.out.println();
            System.out.print("입력할 숫자: ");
            choiceNum = sc.nextInt();

            //메뉴판 종료 및 주문 완료 알림
            if (choiceNum == 0) {
                System.out.println("메뉴판을 종료합니다.");
                break;

            } else if (choiceNum == 1) {
                System.out.println("치킨킹 단품을 주문하셨습니다. 예상 소요시간은 15분 입니다.");

            } else if (choiceNum == 2) {
                System.out.println("치킨킹 세트를 주문하셨습니다. 예상 소요시간은 15분 입니다.");

            } else if (choiceNum == 3) {
                System.out.println("치킨킹 BLT 단품을 주문하셨습니다. 예상 소요시간은 15분 입니다.");

            } else if (choiceNum == 4) {
                System.out.println("치킨킹 BLT 세트를 주문하셨습니다. 예상 소요시간은 15분 입니다.");

            } else {
                System.out.println("메뉴판에 없는 번호를 입력하셨습니다.");
                break;
            }

            System.out.println("메뉴를 더 주문하시겠습니까? (목록에 있는 번호를 입력해주세요.)"); //추가 주문
            System.out.println("0.네");
            System.out.println("1.아니오");
            System.out.print("입력할 숫자: ");
            int yesOrNo = sc.nextInt();

            if (yesOrNo == 0) { //추가 주문 여부에 대한 사용자의 응답을 확인
                System.out.println();
                System.out.println("메뉴판을 불러옵니다.");
                System.out.println();
            } else if (yesOrNo == 1) {
                System.out.println();
                System.out.println("메뉴판을 종료 합니다! 버거킹을 이용해주셔서 감사합니다.");
                break;
            } else {
                System.out.println("명령어를 잘못 입력하셨습니다. 메뉴판을 종료합니다.");
                break;
            }
            sc.close(); //스캐너 사용 종료 메모리 확보
        }
    }
}
