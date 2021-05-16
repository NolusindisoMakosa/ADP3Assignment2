/* JavaCollections.java
* Java class to implement collections
* @Author: Nolusindiso Makosa (219023557)
* Due Date: 16 May 2021
* */

package za.ac.cput.adp3Assignment2;

import java.util.*;

public class JavaCollections {
    //Method implements collection
    public void implementCollection ()
    {
        //Map<String, String> map = new HashMap<>();
        Map map = new HashMap();
        map.put("2016","Alu");
        map.put("2019", "Tumelo");
        map.put("2015", "Wenzo");

        System.out.println("\nCollection added elements\n========================================");
        System.out.println(map);

        System.out.println("--------------After Remove-----------");
        map.remove("2015");
        System.out.println(map);

        System.out.println("-----------------Find--------------");
        if(map.containsKey("2016")) {
            System.out.println("Key Found: " + map.containsKey("2016") );
        } else {
            System.out.println("Key Not found");
        }
     }

    //Method implements Map
    public void implementTreeMap()
    {
        TreeMap<Integer,String> treemap = new TreeMap();
        treemap.put(0, "Lindo");
        treemap.put(1, "Nomusa");
        treemap.put(2, "Mawande");
        treemap.put(3, "Sindi");
        treemap.put(4, "Nangamso");
        treemap.put(5, "Aviwe");

        System.out.println("\nMap added elements\n=========================");
        System.out.println("Key, Value");
        for (Map.Entry m: treemap.entrySet())
        {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        System.out.println("-------After Remove----------");
        treemap.remove(2);
        for (Map.Entry m: treemap.entrySet())
        {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        System.out.println("-----------------Find--------------");
        if(treemap.containsKey(0)) {
            System.out.println("Key Found: " + treemap.containsKey(0));
        } else {
            System.out.println("Key Not found");
        }
    }

    //Method implements Set
    public void implementSet()
    {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        Iterator<Integer> iterator = set.iterator();
        System.out.println("\nSet added elements\n=========================");
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("----------After Remove-------------");
        set.remove(60);
        Iterator<Integer> iterator2 = set.iterator();

        while(iterator2.hasNext())
        {
            System.out.println(iterator2.next());
        }

        System.out.println("--------------Find-----------------");
        if(set.contains(50)){
            System.out.println("Element Found: " + set.contains(50));

        }else {
            System.out.println("Not Found");
        }
    }

    //Method implements List
    public void implementList()
    {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Book A");
        linkedList.add("Book B");
        linkedList.add("Book C");
        linkedList.add("Book D");

        Iterator<String> iterator = linkedList.iterator();
        //transverse through the the list
        System.out.println("\nList added element\n======================");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        linkedList.remove();
        Iterator<String> iterator3 = linkedList.iterator();
//        //transverse through the the list
        System.out.println("---------------------After Delete -----------------");
        while (iterator3.hasNext())
        {
            System.out.println(iterator3.next());
        }
        System.out.println("---------------------Find-----------------------");
        System.out.println("We Found: " + linkedList.get(1) + " at index " + linkedList.indexOf(linkedList.get(1)));
    }

    public static void main(String[] args) {
        JavaCollections jc = new JavaCollections();
        jc.implementCollection();
        jc.implementTreeMap();
        jc.implementSet();
        jc.implementList();
    }
}
