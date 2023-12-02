package View.Commands;

import View.View;

public class AddHuman extends Command {
     private String discription;
     private View view;
    // поле выбора меню: "1 - Добавить имя"


    public AddHuman(View view){
        super("Добавить человека", view);
    }
    
    public void execute(){
    getView().addHuman2();
    }
}
