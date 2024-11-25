package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
  private final List<MenuItem> menuItems = new ArrayList<>();

    public void checkMenu() {
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거" ));
        menuItems.add(new MenuItem("SmokeShack", 6.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거" ));
        menuItems.add(new MenuItem("Hamburger", 6.9, "비프패티를 기반으로 야채가 들어간 기본버거" ));
    }

    public void start() {
       Scanner scanner = new Scanner(System.in);

       while (true) {
           System.out.println("[ SHAKESHACK MENU ]");
           for (int i = 0; i < menuItems.size(); i++) { // 반복문을 통해 List에 있는 요소들을 나열함
               MenuItem item = menuItems.get(i);
               System.out.println((i + 1) + ". " + item.getBurgerName() + " " + item.getPrice() + " " + item.getDescription());
           }
           System.out.println("0. 종료");
           int selectNumber = scanner.nextInt();
           if (selectNumber == 0) {
               System.out.println("프로그램을 종료합니다.");
               break;
           } else if (selectNumber > menuItems.size()){
               System.out.println("항목이 존재하지 않습니다");
               continue;
           }

           System.out.println("선택한 메뉴 : " + selectNumber + ". " +
                   menuItems.get(selectNumber - 1).getBurgerName() + " " +
                   menuItems.get(selectNumber - 1).getPrice() + " " +
                   menuItems.get(selectNumber - 1).getDescription()); // 입력받은 값으로 List에 있는 객체를 선택할 수 있게함


       }
   }
}