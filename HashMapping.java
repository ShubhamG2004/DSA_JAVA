import java.util.HashMap;
import java.util.Map;

public class HashMapping {
    public static void HashMappMethods(){
        //Syntax
        Map<String, Integer> mp=new HashMap<>();

        // Adding element
        mp.put("Shubham",20);
        mp.put("Abhijeet",19);
        mp.put("Purva",18);
        mp.put("Anuj",21);

        // Getting value of a Key
        System.out.println(mp.get("shubham"));
        System.out.println(mp.get("Anuj"));

        // Updating value of Key
        mp.put("Purva",17);

        // Removing a pair from the HashMap
        mp.remove("Purva");

        // Adding New Entry Only if key Doesnt Exist
        if(!mp.containsKey("Sumit"))mp.put("Sumit",23);
        mp.putIfAbsent("Shivam", 24);

        // Get All keys in HashMap
        System.out.println(mp.keySet());

        // Get All Values
        System.out.println(mp.values());

        // Get all entries from the HashMap
        System.out.println(mp.entrySet());

        // Travering all entries of HashMap
        for(String key:mp.keySet()){
            System.out.printf("Age of %s is %s\n",key,mp.get(key));
        }

        System.out.println();
    
        for(Map.Entry<String, Integer> e:mp.entrySet()){
            System.out.printf("Age of %s is %s\n",e.getKey(),e.getValue());
        }
        System.out.println();

        for(var e:mp.entrySet()){
            System.out.printf("Age of %s is %s\n",e.getKey(),e.getValue());
        }
    }
    public static void main(String[] args) {
        HashMappMethods();
    }
}
