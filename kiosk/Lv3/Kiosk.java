package kiosk.Lv3;

import java.util.ArrayList;
import java.util.Scanner;

/** 수정사항
 * Kiosk 클래스를 생성
 * 지문을 잘못 이해하여 start 함수를 쓰레드로 상속 받아 구현.
 * 이후 지문을 재해석 start 메서드로 재구현
 * 쓰레드로 구현했던 내용은 아래 변경 내용을 참조.
 * public class Kiosk extends Thread {} -> public class Kiosk {}
 * public void run() {} -> public void start() {}
 */

public class Kiosk {
    ArrayList<MenuItem> menuList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Kiosk() {
        menuList.add(new MenuItem("치킨킹(단품)", 6400, "스파이시 통닭다리살과 브리오쉬번이 들어간 치킨버거"));
        menuList.add(new MenuItem("치킨킹(세트)", 8400, "스파이시 통닭다리살과 브리오쉬번이 들어간 치킨버거"));
        menuList.add(new MenuItem("치킨킹 BLT(단품)", 7400, "스파이시 통닭다리살, 브리오쉬번, 베이컨, 양상추, 토마토가 들어간 치킨버거."));
        menuList.add(new MenuItem("치킨킹 BLT(세트)", 9000, "스파이시 통닭다리살, 브리오쉬번, 베이컨, 양상추, 토마토가 들어간 치킨버거."));
    }

    public void start() {
        int choiceNum; //choiceNum의 반환타입을 int로 지정.

        while (true) {
            System.out.println(" [ BurgerKing 메뉴판 ] ");
            System.out.println("주문하실 메뉴의 번호를 입력해주세요 메뉴판을 종료하시려면 0을 입력해주세요.");
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i + 1) + ". " + menuList.get(i).getDisplay());
            }
            System.out.println(" 0. 메뉴판 종료.");

            System.out.println();
            System.out.print("입력할 숫자: ");
            choiceNum = sc.nextInt();

            if(choiceNum == 0){
                System.out.println("메뉴판을 종료합니다.");
                break;

            } else if (choiceNum > 0 && choiceNum <= menuList.size()) { // 사용자가 입력한 값이 0보다 크거나 혹은 메뉴리스트의 사이즈 보다 작거나 같을때 동작.
                MenuItem choiceMenu = menuList.get(choiceNum - 1);
                System.out.println(choiceMenu.menuName + "을 주문하셨습니다. 예상 소요시간은 15분 입니다.");
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
                System.out.println("메뉴판을 불러옵니다.");
                System.out.println();
            } else if (yesOrNo == 1) {
                System.out.println("메뉴판을 종료 합니다! 버거킹을 이용해주셔서 감사합니다.");
                break;
            } else {
                System.out.println("명령어를 잘못 입력하셨습니다.");
                System.out.println("다시 입력해주시기 바랍니다.");
            }
        }
        sc.close(); //스캐너 사용 종료 및 메모리 확보
    }
}
