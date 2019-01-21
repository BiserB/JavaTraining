package training.iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        ListyIterator<String> myListy = new ListyIteratorImpl<String>();

        while(!line.equals("END")){

            try{

            String[] data = line.split(" ");

            switch (data[0]){
                case "Create":
                    String[] items = Arrays.copyOfRange(data, 1, data.length);
                    myListy = new ListyIteratorImpl<String>(items);
                    break;
                case "Move":
                    System.out.println(myListy.move());
                    break;
                case "Print":
                    myListy.print();
                    break;
                case "HasNext":
                    System.out.println(myListy.hasNext());
                    break;
                default:
                    System.out.println("Invalid command");
            }

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            line = reader.readLine();
        }

    }
}
