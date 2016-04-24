//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 8
//Due Date: 4/24/16
//************************
package prob3;

public class Player {
private String name;
private int points;
public Player(String name, int points) {
this.name = name;
this.points = points;
}
public String getName() {
return name;
}
public int getPoints() {
return points;
}
@Override
public String toString() {
return "name=" + name + ", points=" + points;
}
}