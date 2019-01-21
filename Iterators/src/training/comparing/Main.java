package training.comparing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        List<Person> persons = new ArrayList<>();

        while(!line.equals("END")){

            String[] data = Stream.of(line.split(" "))
                    .filter(s -> !s.isEmpty())
                    .toArray(String[]::new);

            int age = Integer.parseInt(data[1]);

            Person person = new Person(data[0], age , data[2]);

            persons.add(person);

            line = reader.readLine();
        }

        line = reader.readLine();

        int index = Integer.parseInt(line);

        if(index < 0 || index > persons.size() - 1){
            System.out.println("No matches");
            System.exit(0);
        }

        Person selected = persons.get(index);

        int equal = 0, nonEqual = 0;

        for (Person p:persons ) {
            if (selected.compareTo(p) == 0){
                equal++;
            }else{
                nonEqual++;
            }
        }

        System.out.println(String.format("%d %d %d", equal, nonEqual, persons.size()));
    }
}
