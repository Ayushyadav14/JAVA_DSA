package hashmap;

import java.util.HashMap;

public class start {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
    
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        System.out.println(map.get("Apple"));   
        System.out.println(map.containsKey("Banana")); 

        map.remove("Cherry");

        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        System.out.println("Size: " + map.size());
        
    }
}