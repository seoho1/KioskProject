package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Menu burgerMenu = new Menu("Burger");
        burgerMenu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("SmokeShack", 6.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Hamburger", 6.9, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinkMenu = new Menu("Drink");
        drinkMenu.addMenuItem(new MenuItem("Coca-cola", 5.0, "음료수의 근본"));
        drinkMenu.addMenuItem(new MenuItem("7star Cider", 5.0, "청량한 맛"));
        drinkMenu.addMenuItem(new MenuItem("SamDaSu", 1.0, "제주도 한라산에서 퍼온 물"));

        Menu snackMenu = new Menu("Snack");
        snackMenu.addMenuItem(new MenuItem("chickenTender",7.0, "후려치기의 정석"));
        snackMenu.addMenuItem(new MenuItem("friedPotato",7.0, "햄버거의 파트너"));

        List<Menu> menuList = new ArrayList<>();
        menuList.add(burgerMenu);
        menuList.add(drinkMenu);
        menuList.add(snackMenu);

        Kiosk kiosk = new Kiosk(menuList);
        kiosk.start();
            }
        }

