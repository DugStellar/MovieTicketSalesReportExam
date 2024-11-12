package org.example;
import java.util.Arrays;

public class SalesReport {


        public static void main(String[] args) {
            String[] movies = {"Napoleon", "Oppenheimer"};
            int[][] sales = {{3000, 1500, 1700}, {3500, 1200, 1600}};

            // Calculate total sales for each movie
            int[] totalSales = new int[movies.length];
            for (int i = 0; i < movies.length; i++) {
                totalSales[i] = Arrays.stream(sales[i]).sum();
            }

            // Print movie ticket sales report
            System.out.println("\nMOVIE TICKET SALES REPORT - 2024\n");
            System.out.println("-----------------------------");
            System.out.println("                JAN  FEB  MAR");
            for (int i = 0; i < movies.length; i++) {
                System.out.printf("%-15s %4d %4d %4d%n", movies[i], sales[i][0], sales[i][1], sales[i][2]);
            }

            // Add dotted lines to separate the movie data
            System.out.println("                     ");

            // Calculate and print total sales for each movie
            for (int i = 0; i < movies.length; i++) {
                System.out.printf("Total movie ticket sales for %s: %d%n", movies[i], totalSales[i]);
            }


            // Find and print top performing movie
            MovieTickets movieTickets = new MovieTickets();
            String topMovie = movieTickets.topMovie(movies, totalSales);
            System.out.printf("\nTop performing movie: %s\n", topMovie);
        }
    }

