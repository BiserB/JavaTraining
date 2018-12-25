package wim.core;

import wim.models.Board;
import wim.models.Person;
import wim.models.Team;

import java.util.ArrayList;

public class Manager {

    private ArrayList<Person> persons = new ArrayList<>();
    private ArrayList<Team> teams = new ArrayList<>();
    private ArrayList<Board> boards = new ArrayList<>();

    public void createPerson(String[] args){

        String name = args[0];

        Person person = new Person(name);

        persons.add(person);
    }

    public void createTeam(String[] args) {

    }

    public void createBoard(String[] args) {

    }
}
