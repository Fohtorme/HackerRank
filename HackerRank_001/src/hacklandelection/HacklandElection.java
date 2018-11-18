package hacklandelection;

import java.util.HashMap;

public class HacklandElection {
    
    public static String hacklandElection(String[] ballots){
        String name = null;
        int votes = 0;
        
        HashMap<String, Integer> candidates = new HashMap<>();
        for (String ballot : ballots) {
            if (candidates.get(ballot) == null) {
                candidates.put(ballot, 1);
            } else {
                candidates.put(ballot, candidates.get(ballot) + 1);
            }
            if (candidates.get(ballot) > votes || candidates.get(ballot) == votes && ballot.compareTo(name) > 0) {
                name = ballot;
                votes = candidates.get(ballot);
            }
        }

        return name;
    }
    
    public static void main(String[] args) {
        
        String[] array; 
        array  = new String[]{};
        System.out.println("" + hacklandElection(array));
        array  = new String[]{"Alex", "Michael", "Harry", "Dave", "Michael", 
            "Victor", "Harry", "Alex", "Mary", "Mary"};
        System.out.println("" + hacklandElection(array));
        array  = new String[]{ "victor", "veronica", "ryan", "dave", "maria", 
            "farah", "farah", "ryan", "veronica" };
        System.out.println("" + hacklandElection(array));
        array  = new String[]{"Alex", "Michael", "Harry", "Dave", "Michael", 
            "Victor", "Harry", "Alex", "Mary", "Mary", "Alex"};
        System.out.println("" + hacklandElection(array));
    }
}
