package quests;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shield {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        //map names to agents list
        //Use of a Stream in 3 stages:
        List<Agent> agents = names.stream()                                                         //1. SOURCE: list of Strings containing the names of heroes
                        .map(item -> new Agent(item.split(" ")[0],item.split(" ")[1])) //2. INTERMEDIATE: map - expects an argument Function - transformation of an element
                        .collect(Collectors.toList());                                              //3. TERMINAL: collect - return result in form of a list

        showAgents(agents);

    }

    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}