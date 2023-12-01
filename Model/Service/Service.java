package Model.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Model.Human.Gender;
import Model.Human.Human;
import Model.Tree.FamilyTree.FamilyTree;
import Model.Tree.FamilyTree.HumanBuilder;

public class Service {
    private FamilyTree <Human> tree;
    private HumanBuilder builder;
     
    public Service(){
        tree = new FamilyTree<>();
        builder = new HumanBuilder();
    }
    

    public void addItem(String name, Gender gender, LocalDate bd, Human mother, Human father){
        Human human = builder.build(name, gender, bd, mother, father);
        tree.addHuman(human);
    }
    public void addItem (String name, Gender gender, LocalDate bd){
        Human human = builder.build(name, gender, bd);
        tree.addHuman(human);
    }


    
    public String getHumanInfo(){
    StringBuilder sb = new StringBuilder();
    sb.append("Дерево:");
    for (Human human: tree){
    sb.append("\n");
    sb.append(human);
        }
    return sb.toString();
    }
   
public void sortByAge(){ tree.sortByAge(); }

public void sortByName(){tree.sortByName();} 

// public void addToParents(Human e){
// for (Human parent:e.getParents())
// parent.AddChild(e);
// }
// public void addToChild(Human e){
// for (Human child:e.getChild())
// child.AddParent(e);
// }

public Human getById(long id){
for (Human e: tree){
if (e.getId() == id){
    return e;
}
}
return null;
}
public List<Human> getByName(String name){
List<Human> names = new ArrayList<>();
for(Human n:tree){
if(n.getName().equals(name)){
names.add(n);
}
}
return names;
}

@Override
public String toString() {
    return getHumanInfo();
}
}
