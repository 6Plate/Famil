package View;

import java.util.ArrayList;
import java.util.List;

import View.Commands.AddHuman;
import View.Commands.Command;
import View.Commands.Finish;
import View.Commands.GetHumanListInfo;
import View.Commands.SortByAge;
import View.Commands.SortByName;

public class MainMenu {
    private List<Command> commandList;

    public MainMenu(View view){
        commandList = new ArrayList<>();
        commandList.add(new AddHuman(view));
        commandList.add(new GetHumanListInfo(view));
        commandList.add(new SortByName(view));
        commandList.add(new SortByAge(view));
        commandList.add(new Finish(view));
    
    }

public String print(){
    StringBuilder stringBuilder= new StringBuilder();
    stringBuilder.append("Список команд: \n");
    for(int i = 0; i < commandList.size(); i++){
        stringBuilder.append(i+1);
        stringBuilder.append(".");
        stringBuilder.append(commandList.get(i).getDiscription());
        stringBuilder.append("\n");
    }
    return stringBuilder.toString();
}
    public void execute(int choise){
        Command command = commandList.get(choise -1);
        command.execute();

    }
    public int size(){
        return commandList.size();
    }
}
