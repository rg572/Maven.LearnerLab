package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {
    List<Person> persons;

    public People(){
        persons = new ArrayList<>();
    }

    public void add(Person person){
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

    public Boolean contains(Person person){
        return persons.contains(person);
    }

    public void remove(Person person){
        persons.remove(person);
    }
}
