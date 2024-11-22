package kiosk.Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuList = new ArrayList<>();
        MenuItem chickenKing = new MenuItem("치킨킹(단품) ", 1000, " 맛있다");
        MenuItem chickenKing2 = new MenuItem("치킨킹(세트)", 1000, " 맛있다");
        MenuItem chickenKingBLT = new MenuItem("햄버거", 1000, " 맛있다");
        MenuItem chickenKingBLT2 = new MenuItem("햄버거", 1000, " 맛있다");
        Scanner sc = new Scanner(System.in);

        //메뉴판을 불러올 것인가? 에 대한 지문.
        System.out.print("메뉴판을 확인 하시려면 'Menu' 를 입력해주세요: ");//메뉴판을 확인하시려면 'Menu' 명령어를 입력하는 출력문 필요함.
        String checkMenu = sc.nextLine();

        System.out.println(chickenKing);


        if (checkMenu.equals("Menu")) {
            System.out.println(" [ BurgerKing 메뉴판 ] ");
            System.out.println("주문하실 메뉴의 번호를 입력해주세요 메뉴판을 종료하시려면 0을 입력해주세요.");



//            for () {
            }
        }
    }

