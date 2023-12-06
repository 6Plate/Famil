package Presenter;

import java.time.LocalDate;

import Model.Human.Gender;
import Model.Service.Service;
import View.View;

public class Presenter {
    private View view;
    private Service service;
    
public Presenter (View view) {
    this.view = view;
    service = new Service();
}

public void addHuman2(String name, String gender, int yb, int mb, int db){
    if (gender.equals("мужской")){
        service.addItem(name, Gender.Male, LocalDate.of(yb, mb, db));
    }
     else if(gender.equals("женский")){
        service.addItem(name, Gender.Female, LocalDate.of(yb, mb, db));
    }
    view.answer("Человек успешно добавлен");
}

public String getHumanListInfo(){
     return service.getHumanInfo();
}

public void sortByName(){
    service.sortByName();
}

public void sortByAge(){
    service.sortByAge();
}

public void AddParent(long idHuman, long idPar){
    service.AddParentById(idHuman, idPar);
}

public void addChild(long idHuman, long idCh){
    service.AddChildById(idHuman, idCh);
}
}
