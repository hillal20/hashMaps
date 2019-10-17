package hashMaps;

import java.lang.reflect.TypeVariable;
import java.util.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here

        HashMap<String, String> hashMapObj = new HashMap<String, String>();

        hashMapObj.put("hilal", "aissani");
        hashMapObj.put("hilal1", "aissani1");
        hashMapObj.put("hilal2", "aissani2");
        hashMapObj.put("hilal3", "aissani3");
        hashMapObj.put("hilal4", "aissani4");



        for(HashMap.Entry x : hashMapObj.entrySet()){
            System.out.println("x ===> "+ x.getKey());

        }
         ///// we could store objects in hashMps
        Employee obj = new Employee(1, "Bill Hill ", 7);
         int[] arr = {1,2,3,4,5,6,6,7,7};

        hashMapObj.put("emp1", obj.toString());
        hashMapObj.put( Integer.toString(1) , obj.toString() );
        hashMapObj.put("arr" , Arrays.toString(arr));

        System.out.println("hashMap ===> "+ hashMapObj.entrySet());



        for(HashMap.Entry< String , String> x : hashMapObj.entrySet()){
            String  key   = x.getKey();
            System.out.println("key ===> "+ key);

            System.out.println("j ===> " + hashMapObj.get("1"));
             Object e = (Object) hashMapObj.get("1");

             System.out.println(e);

        }
    }
}