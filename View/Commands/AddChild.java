package View.Commands;

import View.View;

public class AddChild extends Command {
 private String discription;
private View view;
    // поле выбора меню: "1 - Добавить имя"


    public AddChild(View view){
        super("Добавить ребенка", view);
    }
    
    public void execute(){
    getView().addChild();
    }


    
    
}
