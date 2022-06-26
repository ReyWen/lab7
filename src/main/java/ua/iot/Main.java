package main.java.ua.iot;

public class Main {
    public static void main(String[] args) {
        String[] cars = {"the", "or", "are", "on", "in", "out"};
        String x = "Hello, this is me and my friends. I am or is are.";
        for (String i : cars) {
            x = x.replaceAll(" "+i, "");
        }
        System.out.println(x);
    }
}
