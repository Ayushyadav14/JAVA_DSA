package hashmap;

import java.util.HashMap;

public class hashmapdemo {
    public static void main(String[] args) {
        HashMap<Integer ,String> map = new HashMap<>();
        map.put(1,"Ayush");
        map.put(2,"karan");
        map.put(3,"aman");

        System.out.println(map);
        String student = map.get(3);
        System.out.println(student);

        System.out.println(map.containsKey(21));
        System.out.println(map.containsValue("Shubham"));

       
    }
    
}
