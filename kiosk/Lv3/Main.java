package kiosk.Lv3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kiosk menuOpen = new Kiosk();

        //메뉴판을 불러올 것인가? 에 대한 지문.
        System.out.println("메뉴판을 확인 하시려면 'menu' 를 종료를 원하시면 'No' 를 입력해주세요.");//메뉴판을 확인하시려면 'Menu' 명령어를 입력하는 출력문 필요함.

        while (true) {
            System.out.print("menu/no: ");
            String checkMenu = sc.nextLine();

            if (checkMenu.equals("menu")) {
                menuOpen.start();

            } else if (checkMenu.equals("no")){
                System.out.println("이용해주셔서 감사합니다.");

            } else {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("키오스크를 종료합니다.");
            }break;
        }
    }
}


