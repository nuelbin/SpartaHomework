package kiosk.Lv4;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    ArrayList<Menu> menuCategory = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Kiosk() {
        Menu burgersMenu = new Menu("버거");
        burgersMenu.addMenuItem(new MenuItem("치킨킹(단품)", 6400, "스파이시 통닭다리살과 브리오쉬번이 들어간 치킨버거"));
        burgersMenu.addMenuItem(new MenuItem("치킨킹(세트)", 8400, "스파이시 통닭다리살과 브리오쉬번이 들어간 치킨버거"));
        burgersMenu.addMenuItem(new MenuItem("치킨킹 BLT(단품)", 7400, "스파이시 통닭다리살, 브리오쉬번, 베이컨, 양상추, 토마토가 들어간 치킨버거."));
        burgersMenu.addMenuItem(new MenuItem("치킨킹 BLT(세트)", 9000, "스파이시 통닭다리살, 브리오쉬번, 베이컨, 양상추, 토마토가 들어간 치킨버거."));

        // 음료 카테고리 생성 및 메뉴 추가
        Menu drinksMenu = new Menu("음료");
        drinksMenu.addMenuItem(new MenuItem("콜라", 1500, "톡쏘는 단맛이 일품인 콜라"));
        drinksMenu.addMenuItem(new MenuItem("펩시", 1500, "코카콜라 보다 달콤한 맛의 콜라"));
        drinksMenu.addMenuItem(new MenuItem("사이다", 1500, "이곳에서는 칠성사이다만을 팝니다."));

        Menu dessertsMenu = new Menu("디저트");
        dessertsMenu.addMenuItem(new MenuItem("소프트콘", 500, "바닐라맛, 초코맛을 골라 드실수 있습니다"));
        dessertsMenu.addMenuItem(new MenuItem("어니언링", 500, "역시 버거킹은 감튀보단 어니언링이죠!"));

        menuCategory.add(burgersMenu);
        menuCategory.add(drinksMenu);
        menuCategory.add(dessertsMenu);
    }
    boolean trueFalse = true;
    public void start() {
        while (trueFalse) {
            System.out.println("[ 버거킹 카테고리 ]");
            System.out.println("아래 목록에서 번호를 선택해 주세요.");
            for (int i = 0; i < menuCategory.size(); i++) {
                System.out.println((i + 1) + ". " + menuCategory.get(i).getCategoryName());
            }
            System.out.println("0. 키오스크 종료");

            System.out.print("입력할 번호: ");
            int choiceNum = sc.nextInt();

            if (choiceNum == 0) {
                System.out.println("키오스크를 종료합니다.");
                break;
            } else if (choiceNum > 0 && choiceNum <= menuCategory.size()) {
                Menu choiceMenu = menuCategory.get(choiceNum - 1);
                MenuCategory(choiceMenu);
            } else {
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("다시 입력해주세요.");
            }
        }
    }
    private void MenuCategory(Menu choiceMenu) {

        int choiceNum;
        while (trueFalse) {
            System.out.println(" [" + choiceMenu.getCategoryName() + "] ");
            ArrayList<MenuItem> Foods = choiceMenu.getMenuItems();// MenuItem 배열 불러오기.
            System.out.println("주문하실 메뉴의 번호를 입력해주세요 메뉴판을 종료하시려면 0을 입력해주세요.");
            System.out.println();

            for (int i = 0; i < Foods.size(); i++) {
                System.out.println((i + 1) + "." + Foods.get(i).getDisplay());
            }
            System.out.println("0. 키오스크 종료.");

            System.out.println();
            System.out.print("입력할 숫자: ");
            choiceNum = sc.nextInt();

            if (choiceNum == 0) {
                System.out.println("메뉴판을 종료합니다.");
                trueFalse = false;

            } else if (choiceNum > 0 && choiceNum <= Foods.size()) { // 사용자가 입력한 값이 0보다 크거나 혹은 메뉴리스트의 사이즈 보다 작거나 같을때 동작.
                MenuItem choiceFood = Foods.get(choiceNum - 1);
                System.out.println(choiceFood.menuName + "을 주문하셨습니다. 예상 소요시간은 15분 입니다.");
            } else {
                System.out.println("메뉴판에 없는 번호를 입력하셨습니다.");
                System.out.println("다시 입력해주세요.");
                System.out.println();
            }
            while(trueFalse) {
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
                    trueFalse = false;
                } else {
                    System.out.println("명령어를 잘못 입력하셨습니다.");
                    System.out.println("다시 입력해주시기 바랍니다.");
                }
            }
        }
    }
}

