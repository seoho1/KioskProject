package com.example.kiosk;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<Menu> menus;  // 여러 개의 Menu 객체를 저장할 리스트
    private static int selectNumber;
    private final Scanner scanner = new Scanner(System.in);
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        while (true) {
            printMainMenu(); // 메인 메뉴 출력
            selectNumber = getValidNumberInput(0,menus.size()); // scanner로 받는 값 검증
            if(shutdown(selectNumber)){ // 입력값 0일 경우에 프로그램을 종료
                break;
            }

            Menu SelectedFood = printSelectedCategory(); // 세부 메뉴 출력
            selectNumber = getValidNumberInput(0,menus.size()); // scanner로  각 상위메뉴가 갖고 있는 요소의 길이를 검증함
            if(previousMenu(selectNumber)){ // 입력값 0일 경우에 이전 메뉴로 이동
                continue;
            }
            printSelectedFood(SelectedFood); // 선택이 된 음식이 지정되며 출력됨
            }
        }

    public void printMainMenu() {
        System.out.println("[ MAIN MENU ]");
        for (int i = 0; i < menus.size(); i++) { // 반복문을 통해 List에 있는 요소들을 나열함
            System.out.println((1 + i) + ". " + menus.get(i).getCategory());
        }
        System.out.println("0. 종료");
    }
    // 선택이 된 카테고리의 음식목록을 출력함
    public Menu printSelectedCategory(){
        Menu selectedCategory = menus.get(selectNumber - 1);
        System.out.println("[  " + selectedCategory.getCategory() + " MENU  ]");
        selectedCategory.showMenuItem();
        System.out.println("0. 뒤로가기");
        return selectedCategory;
    }
    // 입력 값을 받은 해당 음식만 출력하게함(음식이름, 가격, 설명)
    public void printSelectedFood(Menu selectedCategory) {
        MenuItem selectedFood = selectedCategory.getMenuItem(selectNumber - 1);
        System.out.print("선택한 메뉴 : ");
        System.out.println(selectedFood.toString());
    }

    //0을 입력할시에 프로그램 종료
    public boolean shutdown(int selectNumber) {

        if(selectNumber == 0) {
            System.out.println("프로그램을 종료합니다");
            return true;
        }  return false;
    }
    //카테고리가 선택된 상태에서 다시 원상태로 되돌아가는 기능
    public boolean previousMenu(int selectNumber){
        if(selectNumber == 0) {
            System.out.println("이전 메뉴로 돌아갑니다.");
            return true;
        } return false;
    }

    //이 부분은 chatgpt로 도움을 받음, try-catch로 하고 싶었는데 하지 못함
    public int getValidNumberInput(int min, int max) {
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("숫자만 입력하세요.");
                scanner.next();
                continue;
            }
            int number = scanner.nextInt();
            scanner.nextLine();

            if (number < min || number > max) {
                System.out.println("입력값이 범위를 벗어났습니다.");
                continue;
            }
            return number;
        }
    }
}
