package concurency.prodcons;

import java.util.ArrayList;
import java.util.List;

public class Resource {

    private final List<Element> elements = new ArrayList<>();

    public void put(Element element){

        elements.add(element);
        System.out.println("Put element: " + element);

    }

    public Element pop(){

        Element element = elements.remove(0);
        System.out.println(" >>> Pop element: " + element);

        return element;
    }

    public Element get(){
        return elements.get(0);
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }

    public boolean isFull(){
        return size() == 5;
    }

    public int size(){
        return elements.size();
    }
}
