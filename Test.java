import java.util.*;

class Bowling {

    HashMap<String, Integer> players;

    Bowling() {

        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    // your code goes here

    public void getWinner() {

        Set<String> playersName = players.keySet();
        Iterator<String> it = playersName.iterator();
        Integer max = Collections.max(players.values());

        String winner = "";

        while (it.hasNext()) {
            String current = it.next();
            if (players.get(current) == max) {
                winner = current;
            }
        }

        System.out.println(winner);
    }

}

public class Test {
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}