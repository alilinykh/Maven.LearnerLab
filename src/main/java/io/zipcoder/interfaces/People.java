package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable {
    private List<Person> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public void add(Person person) {
        personList.add(person);
    }
    public Person findById(Long id) {
        for (Person p: personList
             ) {
            if(p.getId().equals(id)) {return p;}
        }
        return null;
    }
    public boolean contains(Person person) {
        return personList.contains(person);
    }
    public void remove(Person person) {
        personList.remove(person);
    }
    public void remove(Long id) {
        Integer index = personList.indexOf(id);
        personList.remove(index);
    }
    public void removeAll() {
        personList.clear();
    }

    public Integer count() {
        return personList.size();
    }

    public People[] toArray() {
        People[] result = (People[])personList.toArray();
        return  result;
    }

    @Override
    public Iterator iterator() {
        return personList.iterator();
    }
}
