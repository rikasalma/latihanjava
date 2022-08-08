import Main.Buku;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LimaJuli_Hashmap {
    public static void main(String[] args) {
        Map<String,Object>dictionary = new HashMap<>();
//        dictionary.put("nama","rika");
//        dictionary.put("umur",25);
        dictionary.put("buku",1);
//
//        System.out.println(dictionary.get("nama"));
//        Map<Integer, String> days = new HashMap<>();
//        days.put(1,"Minggu");
//        days.put(2,"Senin");
//        days.put(3,"Selasa");
//        days.put(4,"Rabu");
//        days.put(5,"Kamis");
//        days.put(6,"Jumat");
//        days.put(7,"Sabtu");
//        System.out.println(days.size());
//        System.out.println(days);
//        System.out.println();
//        for (int i = 1; i<days.size();i++);

// Tree Map
        Map<Object,String> treeMap = new TreeMap();
        treeMap.put(3,"gsdfgfd");
        treeMap.put(1, "hasda");
        treeMap.put(5, "hfghsdf");
//        System.out.println(treeMap.lastKey);
    }
}

//int angka-> primitif karena ga punya deklarasi
//Integer number-> sebuah class
//