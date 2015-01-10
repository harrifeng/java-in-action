package org.hfeng.misc.ej2.item12;

import java.util.Arrays;
import java.util.Comparator;

class Player implements Comparable<Player>, Comparator<Player>{
    private int _number;
    private String _name;

    Player(int number, String name) {
        _number = number;
        _name = name;
    }

    Player() {
    }

    public String toString() {
        return String.format("No:%d-Name: %s", _number, _name);
    }

    public int compare(Player p, Player p2) {
        return p._name.compareTo(p2._name);

    }
    public int compareTo(Player p) {
        return this._number - p._number;
    }
}

public class TestOrder {
    public static void main(String[] args) {
        Player[] players = new Player[]{new Player(1, "Allen"),
                new Player(2, "Wade"), new Player(3, "Benson")};
        Arrays.sort(players);
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new Player());
        System.out.println(Arrays.toString(players));
    }
}

////////////////////////////////////////////////////////////
// <===================OUTPUT===================>         //
// [No:1-Name: Allen, No:2-Name: Wade, No:3-Name: Benson] //
// [No:1-Name: Allen, No:3-Name: Benson, No:2-Name: Wade] //
////////////////////////////////////////////////////////////
