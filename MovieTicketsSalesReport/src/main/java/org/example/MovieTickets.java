package org.example;

public class MovieTickets implements IMovieTickets {

    @Override
    public int totalMovieSales(int[] movieTicketSales) {
        int totalSales = 0;
        for (int sales : movieTicketSales) {
            totalSales += sales;
        }
        return totalSales;
    }

    @Override
    public String topMovie(String[] movies, int[] totalSales) {
        int maxSales = 0;
        int maxIndex = 0;
        for (int i = 0; i < totalSales.length; i++) {
            if (totalSales[i] > maxSales) {
                maxSales = totalSales[i];
                maxIndex = i;
            }
        }
        return movies[maxIndex];
    }
}
