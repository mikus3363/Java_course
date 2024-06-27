package kursJava;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class lekcja_16_uporz {
    public static void main(String[] args) {


        Set<Element> set = new TreeSet<Element>(
                new Comparator<Element>() {
                    @Override
                    public int compare(Element o1, Element o2) {
                        String opiso1 = o1.getOpis();
                        String opiso2 = o2.getOpis();

                        return opiso1.compareTo(opiso2);
                    }
                }
        );

        set.add(new Element(1234,"aopis"));
        set.add(new Element(5,"zopis"));
        set.add(new Element(5678,"copis"));

        Iterator<Element> iter = set.iterator();
        while(iter.hasNext()) System.out.println(iter.next().getOpis());
    }
}
