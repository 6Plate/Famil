package View.Commands;

import View.View;

public class AddParent extends Command{
private String discription;
private View view;

public AddParent(View view){
    super("Добавить родителя", view);
}

public void execute(){
getView().AddParent();
}
}
