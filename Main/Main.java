package Main;

import Main.Main;
import java.time.LocalDate;
import Model.Human.Gender;
import Model.Human.Human;
import Model.Service.Service;
import Model.Tree.FamilyTree.FamilyTree;

public class Main {

public static void main(String[] args) {
    // FamilyTree tree = new FamilyTree<>();
    // Human humanK = new Human("Kirill", Gender.Male, LocalDate.of(1976, 11, 6));
    // Human humanJ = new Human("Julia", Gender.Female, LocalDate.of(1978, 8, 30));
    // tree.addHuman(humanJ);
    // tree.addHuman(humanK);
    // Human humanPl = new Human("Platon", Gender.Male, LocalDate.of(2004, 4, 2004), humanK, humanJ);
    // tree.addHuman(humanPl);
    // Human lyudmila = new Human("Lyudmila", Gender.Female, LocalDate.of(1951, 11, 6));
    // lyudmila.AddChild(humanK);
    // tree.addHuman(lyudmila);
    Service service = new Service();
    service.addItem("Kirill", Gender.Male, LocalDate.of(1976, 11, 6));
    service.addItem("Julia", Gender.Female, LocalDate.of(1978, 8, 30));
    System.out.println(service.getHumanInfo());
    service.addItem("Platon", Gender.Male, LocalDate.of(2004, 4, 12), service.getById(1), service.getById(0));
    System.out.println(service.getHumanInfo());
    service.getById(0).AddChild(service.getById(2));
    service.getById(1).AddChild(service.getById(2));
    System.out.println(service.getHumanInfo());
    

    


    
}
}