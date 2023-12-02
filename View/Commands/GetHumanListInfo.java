package View.Commands;

import View.View;

public class GetHumanListInfo extends Command {
     private String discription;
     private View view;
    // поле выбора меню: "1 - Добавить имя"


    public GetHumanListInfo(View view){
        super("Выести список людей", view);
    }
    
    public void execute(){
    getView().getHumanListInfo();
    }
}
