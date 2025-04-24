package collection;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        /*
        valid declaration types.

        Collection list = new ArrayList<>();                 //non-generic
        List list = new ArrayList<>();                       //non-generic
        ArrayList list = new ArrayList<>();                  //non-generic
        ArrayList list = new ArrayList<String>();            //non-generic

        Collection<Integer> list = new ArrayList<>();        //generic
        List<Integer> list = new ArrayList<>();              //generic
        ArrayList<Integer> list = new ArrayList<>();         //generic

        */


        List list = new ArrayList<>();     // non-generic ArrayList. Not type safe i.e. can add any type of data.
        list.add(1);
        list.add("ABC");
        list.remove(1);

        int x = (int) list.get(0);          // type-casting required to access elements of non-generic list.
        String y = (String) list.get(1);

        List<Integer> list2 = new ArrayList<>();   // generic ArrayList. type safe.
        list2.add(123);

        int z = list2.get(0);     // eliminates need of Type-Casting to access elements of generic list.

        list2.forEach(System.out::println);     // iterating list using forEach loop.

        for (int i = 0; i < list.size(); i++)     // iterating using regular for loop.
        {
            System.out.println(list.get(i));
        }

        for (Object o : list){      // iterating non-generic list using enhanced for loop
            System.out.println(o);
        }

        for (int i : list2){      // iterating list using enhanced for loop
            System.out.println(i);
        }

        Iterator it = list.iterator();    // iterating list using Iterator object. used to iterate over generic and non-generic list.
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}