package View.Commands;

import View.View;

public class SortByAge extends Command {
     private String discription;
     private View view;
    // поле выбора меню: "1 - Добавить имя"


    public SortByAge(View view){
        super("Сортировать по возрасту", view);
    }
    
    public void execute(){
    getView().sortByAge();
    }
}
