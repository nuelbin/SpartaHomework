package kiosk.Lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuList = new ArrayList<>();
        MenuItem chickenKing = new MenuItem("1. 치킨킹(단품)", 6400, "스파이시 통닭다리살과 브리오쉬번이 들어간 치킨버거");
        MenuItem chickenKing2 = new MenuItem("2. 치킨킹(세트)", 8400, "스파이시 통닭다리살과 브리오쉬번이 들어간 치킨버거");
        MenuItem chickenKingBLT = new MenuItem("3. 치킨킹 BLT(단품)", 7400, "스파이시 통닭다리살, 브리오쉬번, 베이컨, 양상추, 토마토가 들어간 치킨버거.");
        MenuItem chickenKingBLT2 = new MenuItem("4. 치킨킹 BLT(세트)", 9000, "스파이시 통닭다리살, 브리오쉬번, 베이컨, 양상추, 토마토가 들어간 치킨버거.");
        Scanner sc = new Scanner(System.in);

        //메뉴판을 불러올 것인가? 에 대한 지문.
        System.out.print("메뉴판을 확인 하시려면 'Menu' 를 입력해주세요: ");//메뉴판을 확인하시려면 'Menu' 명령어를 입력하는 출력문 필요함.
        String checkMenu = sc.nextLine();

        if (checkMenu.equals("Menu")) {
            System.out.println(" [ BurgerKing 메뉴판 ] ");
            System.out.println("주문하실 메뉴의 번호를 입력해주세요 메뉴판을 종료하시려면 0을 입력해주세요.");
            System.out.println(chickenKing.getDisplay());
            System.out.println(chickenKing2.getDisplay());
            System.out.println(chickenKingBLT.getDisplay());
            System.out.println(chickenKingBLT2.getDisplay());

            System.out.println();
            System.out.print("입력할 숫자: ");
            }
        }
    }

