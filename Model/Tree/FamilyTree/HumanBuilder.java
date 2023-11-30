package Model.Tree.FamilyTree;

import java.time.LocalDate;

import Model.Human.Gender;
import Model.Human.Human;

public class HumanBuilder {
    public Human build(String name, Gender gender, LocalDate bd, LocalDate dd, Human mother, Human father){
        Human human = new Human ( name, gender, bd, dd, mother, father);
        return human;
    }
    public Human build (String name, Gender gender, LocalDate bd){
    Human human = new Human(name, gender, bd);
    return human;
}

    public Human build (String name, Gender gender, LocalDate bd, Human mother, Human father){
        Human human = new Human(name, gender, bd, mother, father);
        return human;
    }
}

