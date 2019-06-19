package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class People<E extends Person> implements Iterable {
    private List<E> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public void add(E person) {
        personList.add(person);
    }
    public E findById(Long id) {
        for (E p: personList
             ) {
            if(p.getId().equals(id)) {return p;}
        }
        return null;
    }
    public boolean contains(E person) {
        return personList.contains(person);
    }
    public void remove(E person) {
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

    abstract E[] toArray();
//        E[] result = (E[])personList.toArray();
//        return  result;
//    }

    @Override
    public Iterator iterator() {
        return personList.iterator();
    }
}
