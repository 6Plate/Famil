package View;

import java.util.Scanner;
import Presenter.Presenter;

public class ConsoleUI implements View {
private Scanner scanner;
private Presenter presenter;
private boolean work;
private MainMenu menu;
public ConsoleUI(){
    scanner = new Scanner(System.in);
    presenter = new Presenter(this);
    work = true;
    menu = new MainMenu(this);
}
    @Override
    public void start() {
    System.out.println("Приветсвую!");
    while (work) {
    printMenu();
    scanMenu();
    }
}
    private void scanMenu(){
        String choiseStr = scanner.nextLine();
        int choise = Integer.parseInt(choiseStr);
        menu.execute(choise);
        
        }
    public void addHuman2(){
        System.out.println("Укажите имя человека");
        String name = scanner.nextLine();
        System.out.println("Укажите пол человека");
        String gender = scanner.nextLine();
        System.out.println("Укажите год рождения:");
        String ybStr = scanner.nextLine();
        int yb = Integer.parseInt(ybStr);
        System.out.println("Укажите месяц рождения:");
        String mbStr = scanner.nextLine();
        int mb = Integer.parseInt(mbStr);
        System.out.println("Укажите день рождения:");
        String dbStr = scanner.nextLine();
        int db = Integer.parseInt(dbStr);
        presenter.addHuman2(name, gender, yb, mb, db);
    }

    public void getHumanListInfo(){
        presenter.getHumanListInfo();
    }

    public void sortByName(){
        presenter.sortByName();
    }

    public void sortByAge(){
        presenter.sortByAge();
    }


    public void finish(){
        System.out.println("До новых встреч!");
        work = false;
    }

    public void error(){
        System.out.println("Вы указали неверное значение");
    }
    private void printMenu(){
    System.out.println(menu.print());
    }

    @Override
    public void answer(String answer) {
    System.out.println(answer);
    }
}