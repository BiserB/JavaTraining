package wim.core;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Engine {

    private static String EXIT = "Exit";
    private static Scanner scanner = new Scanner(System.in);
    private static Manager manager = new Manager();

    public void Run() {

        while (true){

            String line = scanner.nextLine();

            validateInput(line);

            if (line.equals(EXIT)){
                break;
            }

            try{
                interpretCommand(line);
            }
            catch(Exception ex){

                System.out.println(ex.getMessage());
            }

        }
    }

    private void interpretCommand(String line) {

        String[] data = Stream.of(line.split(" "))
                                        .filter(s -> !s.isEmpty())
                                        .toArray(String[]::new);

        String[] args = Arrays.copyOfRange(data, 1, data.length);

        switch (data[0]){
            case "createPerson":
                manager.createPerson(args);
                break;
            case "createTeam":
                manager.createTeam(args);
                break;
            case "createBoard":
                manager.createBoard(args);
                break;
        }
    }

    private void validateInput(String line) {

        if (line == null || line.isEmpty()){
            throw new IllegalArgumentException();
        }
    }
}
