package kiosk.Lv2;

public class MenuItem {

    public String menuName;
    public int menuPrice;
    public String menuDes;

    public MenuItem(String menuName, int menuPrice, String menuDes) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuDes = menuDes;
    }

    public String getDisplay() {
        return menuName + "|" + menuPrice + "원|" +menuDes;
    }
}


