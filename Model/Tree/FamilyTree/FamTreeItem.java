package Model.Tree.FamilyTree;

import java.util.List;


public interface FamTreeItem <E> extends Comparable <E> {
int getAge();
String getName();
void setId(Long id);
long getId();
String getInfo();
List <E> getParents();
void AddParent(E e);
boolean AddChild (E e);
List<E> getChild();
}