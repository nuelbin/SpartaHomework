package kiosk.Lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuList = new ArrayList<>();
        menuList.add(new MenuItem("치킨킹(단품)", 6400, "스파이시 통닭다리살과 브리오쉬번이 들어간 치킨버거"));
        menuList.add(new MenuItem("치킨킹(세트)", 8400, "스파이시 통닭다리살과 브리오쉬번이 들어간 치킨버거"));
        menuList.add(new MenuItem("치킨킹 BLT(단품)", 7400, "스파이시 통닭다리살, 브리오쉬번, 베이컨, 양상추, 토마토가 들어간 치킨버거."));
        menuList.add(new MenuItem("치킨킹 BLT(세트)", 9000, "스파이시 통닭다리살, 브리오쉬번, 베이컨, 양상추, 토마토가 들어간 치킨버거."));
        Scanner sc = new Scanner(System.in);

        //메뉴판을 불러올 것인가? 에 대한 지문.
        System.out.print("메뉴판을 확인 하시려면 'Menu' 를 입력해주세요: ");//메뉴판을 확인하시려면 'Menu' 명령어를 입력하는 출력문 필요함.
        String checkMenu = sc.nextLine();

        int choiceNum = 0;
        while (true) {
            if (checkMenu.equals("Menu")) {
                System.out.println();

                //메뉴판 출력문
                System.out.println(" [ BurgerKing 메뉴판 ] ");
                System.out.println("주문하실 메뉴의 번호를 입력해주세요 메뉴판을 종료하시려면 0을 입력해주세요.");
                for (int i = 0; i < menuList.size(); i++) {
                    System.out.println((i + 1) + ". " + menuList.get(i).getDisplay());
                }
                System.out.println("0. 메뉴판 종료.");
                System.out.println();

                System.out.print("입력할 숫자: ");
                choiceNum = sc.nextInt();
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
            }

            /** 수정사항
             * 원래의 코드
             * if (choiceNum == 0) {
             *                 System.out.println("메뉴판을 종료합니다.");
             *                 System.out.println();
             *                 onOff = false;
             *             } else if (choiceNum == 1) {
             *                 System.out.println("치킨킹 단품을 주문하셨습니다. 예상 소요시간은 15분 입니다.");
             *                 System.out.println();
             *             } else if (choiceNum == 2) {
             *                 System.out.println("치킨킹 세트를 주문하셨습니다. 예상 소요시간은 15분 입니다.");
             *                 System.out.println();
             *             } else if (choiceNum == 3) {
             *                 System.out.println("치킨킹 BLT 단품을 주문하셨습니다. 예상 소요시간은 15분 입니다.");
             *                 System.out.println();
             *             } else if (choiceNum == 4) {
             *                 System.out.println("치킨킹 BLT 세트를 주문하셨습니다. 예상 소요시간은 15분 입니다.");
             *                 System.out.println();
             *             } else {
             *                 System.out.println("메뉴판에 없는 번호를 입력하셨습니다.");
             *                 onOff = false;
             *             }
             *
             *           원래의 코드는 메뉴가 4개라는 가정하에 만들어 차후 수정이 번거롭다고 판단. 코드를 좀 더 깔끔하게 만들기 위해 수정.
             */
            //메뉴판 종료 및 주문 완료 알림
            if (choiceNum == 0) {
                System.out.println("메뉴판을 종료합니다.");
                break;

            } else if (choiceNum > 0 && choiceNum <= menuList.size()) { // 사용자가 입력한 값이 0보다 크거나 혹은 메뉴리스트의 사이즈 보다 작거나 같을때 동작.
                MenuItem choiceMenu = menuList.get(choiceNum - 1);
                System.out.println(choiceMenu.menuName + "을 주문하셨습니다. 예상 소요시간은 15분 입니다.");
            }
            else {
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
            }
        sc.close(); //스캐너 사용 종료 메모리 확보
        }
    }

