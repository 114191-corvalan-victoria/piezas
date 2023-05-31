package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

            Reina reina = new Reina();
            /* IMPORTANT: Do not change this code */
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to Queen's Attack!");
            System.out.println("Chessboard size:");
            Integer n = scanner.nextInt();
            System.out.println("Number of obstacles:");
            Integer k = scanner.nextInt();
            System.out.println("Queen start position:");
            System.out.println("Row:");
            Integer r_q = scanner.nextInt();
            System.out.println("Column:");
            Integer c_q = scanner.nextInt();

            List<List<Integer>> obstacles = new ArrayList<>();
            for(int i = 0; i < k; i++) {
                List<Integer> point = new ArrayList<>();
                System.out.println("Obstacle " + (i+1) + ":");
                System.out.println("Row:");
                point.add(scanner.nextInt());
                System.out.println("Column:");
                point.add(scanner.nextInt());
                obstacles.add(point);
            }
            System.out.println("Result:");
            reina.MovimientoReina(n, k, r_q, c_q, obstacles);
        }
    }
