package pages;

import java.util.HashMap;
import java.util.Map;

public class Test1 extends Test{
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "111111");
        hashMap.put(2, "2222222");
        hashMap.put(3, "3333333");
        hashMap.put(4, "444444 ");
        hashMap.put(5 , "5555555");
        System.out.println(hashMap.entrySet());
        for (Map.Entry i : hashMap.entrySet()) {
             System.out.println(i.getKey() + "  " +i.getValue());
        }
    }
}
