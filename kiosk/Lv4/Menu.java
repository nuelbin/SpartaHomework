package kiosk.Lv4;

import java.util.ArrayList;

public class Menu {
    private String categoryName; // 카테고리 이름 (예: 버거, 음료, 디저트)
    private ArrayList<MenuItem> menuItems; // 카테고리에 속한 메뉴 항목 리스트

    // 생성자: 카테고리 이름을 초기화
    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    // 카테고리 이름 반환
    public String getCategoryName() {
        return categoryName;
    }

    // 메뉴 항목 추가
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    // 메뉴 리스트 반환
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

}
