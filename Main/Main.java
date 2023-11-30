package Main;

import Main.Main;
import java.time.LocalDate;
import Model.Human.Gender;
import Model.Human.Human;
import Model.Tree.FamilyTree.FamilyTree;

public class Main {

public static void main(String[] args) {
    FamilyTree tree = new FamilyTree<Human>();
    Human human1 = new Human("Platon", Gender.Female, LocalDate.of(2004, 4, 12));
    tree.addHuman(human1);
    Human human2 = new Human("Kirill", Gender.Female, LocalDate.of(1976, 11, 6));
    Human human3 = new Human("  Julia", Gender.Male, LocalDate.of(1978, 9, 30));
    human2.AddChild(human1);
    human3.AddChild(human1);
    human1.AddParents(human2);
    human1.AddParents(human3);
    tree.getInfoTree();

}
}