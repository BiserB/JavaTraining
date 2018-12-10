package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MostFrequent2 {

    public static void main(String[] args)throws IOException{

        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        Map<Short, Short> register = new HashMap<>();

        for (int i = 0; i < count; i++) {
            Short num = Short.parseShort(reader.readLine());
            Short value = register.get(num);

            if (value == null){
                value = 0;
            }

            register.put(num, ++value);
        }

        short maxFrequency = 0;
        short mostFrequent = 0;

        for (HashMap.Entry<Short, Short> entry:register.entrySet()) {

            short currentFrequency = entry.getValue();
            if (currentFrequency > maxFrequency){
                maxFrequency = currentFrequency;
                mostFrequent = entry.getKey();
            }
        }

        System.out.println(mostFrequent + "(" + maxFrequency + " times)");
    }
}
