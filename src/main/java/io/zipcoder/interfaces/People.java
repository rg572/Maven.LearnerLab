package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{
    private List<E> persons;

    public People(){
        persons = new ArrayList<>();
    }

    public void add(E person){
        persons.add(person);
    }

    public Person findById(long id){
        for(Person peon : persons){
            if(peon.getId() == id){
                return peon;
            }
        }
        return null;
    }

    public Boolean contains(E person){
        return persons.contains(person);

    }

    public void remove(E person){
        persons.remove(person);
    }

    public void remove(long id){
//        for(int i =persons.size() -1; i <= 0; i--){
//            if(persons.get(i).getId() == id){
//                persons.remove(persons.get(i));
//
//            }
//        }

        Iterator itr = persons.iterator();
        while(itr.hasNext()){
            Person peon = (Person)itr.next();
            if(peon.getId()==id){
                itr.remove();
            }
        }
    }

    public void removeAll(){
        persons.clear();
    }

    public Integer count(){
        return persons.size();
    }

    abstract public E[] toArray();

    @Override
    public Iterator<E> iterator() {
        return persons.iterator();
    }
}
