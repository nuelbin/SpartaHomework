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

//    @Override
//    public String toString() {
//      String All = "name: " + menuName + "Price: " + menuPrice + "Des:" +menuDes;
//      return All;
//    }


//    @Override
//    public String toString() {
//        return "MenuItem{" +
//                "menuName='" + menuName + '\'' +
//                ", menuPrice=" + menuPrice +
//                ", menuDes='" + menuDes + '\'' +
//                '}';
//    }

    public String getDisplay() {
        return "name: " + menuName + "Price: " + menuPrice + "Des:" +menuDes;
    }
}


