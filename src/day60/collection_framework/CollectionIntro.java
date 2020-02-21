package day60.collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//a class extends another class
//an interface extends another inteface
//a class implements one or more interfaces

public class CollectionIntro {

    List<String> names = new ArrayList<>();
    //list interfce extends Collection inteface
    //and arraylist implements list inteface
    //so we safely say Arraylist IS-A Collection
    Collection<String> names2 = new ArrayList<>();

}
