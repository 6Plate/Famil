package View.Commands;

import View.View;

public class SortByName extends Command {
     private String discription;
     private View view;
    // поле выбора меню: "1 - Добавить имя"


    public SortByName(View view){
        super("Cортировать по имени", view);
    }
    
    public void execute(){
    getView().sortByName();
    }
}
