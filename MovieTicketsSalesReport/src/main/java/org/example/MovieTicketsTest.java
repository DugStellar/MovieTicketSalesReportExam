package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTicketsTest {

    @Test
    public void calculateTotalSales_ReturnsExpectedTotalSales() {
        MovieTickets movieTickets = new MovieTickets();
        int[] ticketSales = {100, 200, 300};
        int expectedTotalSales = 600;

        int actualTotalSales = movieTickets.totalMovieSales(ticketSales);

        assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test
    public void topMovieSales_ReturnsTopMovie() {
        MovieTickets movieTickets = new MovieTickets();
        String[] movies = {"Movie1", "Movie2", "Movie3"};
        int[] totalSales = {100, 250, 150};
        String expectedTopMovie = "Movie2";

        String actualTopMovie = movieTickets.topMovie(movies, totalSales);

        assertEquals(expectedTopMovie, actualTopMovie);
    }
}
