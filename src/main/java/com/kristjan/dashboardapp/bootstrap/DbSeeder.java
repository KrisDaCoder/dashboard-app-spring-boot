package com.kristjan.dashboardapp.bootstrap;

import com.kristjan.dashboardapp.domain.Chart;
import com.kristjan.dashboardapp.domain.Coordinates;
import com.kristjan.dashboardapp.domain.Dashboard;
import com.kristjan.dashboardapp.repository.DashboardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

    private DashboardRepository dashboardRepository;

    public DbSeeder(DashboardRepository dashboardRepository) {
        this.dashboardRepository = dashboardRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Dashboard> dashboardList = new ArrayList<>();

        Dashboard football = new Dashboard(
                "Football",
                Arrays.asList(
                        new Chart(
                                "chart-1",
                                "line",
                                "Top current goalscorers in the Champions League",
                                "# of goals",
                                Arrays.asList(
                                        "#9d7880"
                                ),
                                Arrays.asList(
                                        "#111010"
                                ),
                                Arrays.asList(
                                        "Dzeko", "Messi", "Dybala", "Kane", "Lewandowski"
                                ),
                                Arrays.asList(
                                        5, 5 , 4, 4, 4
                                ),
                                new Coordinates(0, 0, 13, 8)
                        ),
                        new Chart(
                                "chart-2",
                                "bar",
                                "Most successful teams in the Champions League history",
                                "# of titles",
                                Arrays.asList(
                                        "#d87508", "#36A2EB", "#FFCE56", "#4BC0C0", "#9966FF"
                                ),
                                Arrays.asList(
                                        "#090909", "#141415", "#FFCE56", "#4BC0C0", "#2b292f"
                                ),
                                Arrays.asList(
                                        "Real Madrid", "AC Milan", "Bayern Munich", "Barcelona", "Liverpool"
                                ),
                                Arrays.asList(
                                        13, 7, 5, 5, 5
                                ),
                                new Coordinates(23, 0, 9, 6)
                        ),
                        new Chart(
                                "chart-3",
                                "pie",
                                "Most successful teams in Serie A",
                                "# of titles",
                                Arrays.asList(
                                        "#d87508", "#36A2EB", "#FFCE56", "#4BC0C0", "#9966FF", "#FF9F40", "#d87508", "#36A2EB", "#FFCE56"
                                ),
                                Arrays.asList(
                                        "#090909", "#141415", "#FFCE56", "#4BC0C0", "#2b292f", "#FF9F40", "#d87508", "#36A2EB", "#FFCE56"
                                ),
                                Arrays.asList(
                                        "Juventus", "AC Milan", "Internazionale", "Genoa", "Torino", "Pro Vercelli", "Bologna", "Roma", "Napoli"
                                ),
                                Arrays.asList(
                                        34, 18, 18, 9, 7, 7, 7, 3, 2
                                ),
                                new Coordinates(13, 0, 10, 7)
                        )
                )
        );

        Dashboard sales = new Dashboard(
                "Sales",
                Arrays.asList(
                        new Chart(
                                "chart-1",
                                "line",
                                "Sales per month",
                                "Value in EUR",
                                Arrays.asList(
                                        "#9d7880"
                                ),
                                Arrays.asList(
                                        "#111010"
                                ),
                                Arrays.asList(
                                        "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
                                ),
                                Arrays.asList(
                                        112, 150, 50, 75, 90, 90, 350, 40, 15, 16, 310, 120
                                ),
                                new Coordinates(0, 0, 13, 8)
                        ),
                        new Chart(
                                "chart-2",
                                "bar",
                                "Earnings per month in EUR",
                                "Value in EUR",
                                Arrays.asList(
                                        "#d87508", "#36A2EB", "#FFCE56", "#4BC0C0", "#9966FF", "#d87508", "#36A2EB", "#FFCE56", "#4BC0C0", "#9966FF", "#d87508", "#36A2EB"
                                ),
                                Arrays.asList(
                                        "#d87508", "#36A2EB", "#FFCE56", "#4BC0C0", "#9966FF", "#d87508", "#36A2EB", "#FFCE56", "#4BC0C0", "#9966FF", "#d87508", "#36A2EB"
                                ),
                                Arrays.asList(
                                        "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
                                ),
                                Arrays.asList(
                                        1000, 1500, 300, 500, 700, 700, 2500, 200, 100, 2200, 1100
                                ),
                                new Coordinates(23, 0, 9, 6)
                        ),
                        new Chart(
                                "chart-3",
                                "pie",
                                "Expenses per month",
                                "Value in EUR",
                                Arrays.asList(
                                        "#d87508", "#36A2EB", "#FFCE56", "#4BC0C0", "#9966FF", "#d87508", "#36A2EB", "#FFCE56", "#4BC0C0", "#9966FF", "#d87508", "#36A2EB"
                                ),
                                Arrays.asList(
                                        "#d87508", "#36A2EB", "#FFCE56", "#4BC0C0", "#9966FF", "#d87508", "#36A2EB", "#FFCE56", "#4BC0C0", "#9966FF", "#d87508", "#36A2EB"
                                ),
                                Arrays.asList(
                                        "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
                                ),
                                Arrays.asList(
                                        56, 75, 25, 30, 45, 45, 175, 20, 7, 8, 155, 60
                                ),
                                new Coordinates(13, 0, 10, 7)
                        )
                )
        );

        Dashboard oscars = new Dashboard(
                "Oscars",
                Arrays.asList(
                        new Chart(
                                "chart-1",
                                "line",
                                "Most awarded male actors of all time",
                                "# of Oscars",
                                Arrays.asList(
                                        "#9d7880"
                                ),
                                Arrays.asList(
                                        "#111010"
                                ),
                                Arrays.asList(
                                        "Jack Nicholson", "Walter Brennan", "Daniel Day Lewis", "Marlon Brando", "Robert De Niro", "Tom Hanks", "Christoph Waltz", "Denzel Washington", "Kevin Spacey", "Sean Penn"
                                ),
                                Arrays.asList(
                                        3, 3, 3, 2, 2, 2, 2, 2, 2, 2
                                ),
                                new Coordinates(0, 0, 13, 8)
                        ),
                        new Chart(
                                "chart-2",
                                "bar",
                                "Most awarded female actors of all time",
                                "# of Oscars",
                                Arrays.asList(
                                        "#d87508", "#36A2EB", "#FFCE56", "#4BC0C0", "#9966FF"
                                ),
                                Arrays.asList(
                                        "#090909", "#141415", "#FFCE56", "#4BC0C0", "#2b292f"
                                ),
                                Arrays.asList(
                                        "Meryl Streep", "Katharine Hepburn", "Ingrid Bergman", "Cate Blanchett", "Hilary Swank"
                                ),
                                Arrays.asList(
                                        3, 4, 3, 2, 2
                                ),
                                new Coordinates(23, 0, 9, 6)
                        ),
                        new Chart(
                                "chart-3",
                                "pie",
                                "Most awarded movies of all time",
                                "# of titles",
                                Arrays.asList(
                                        "#090909", "#141415", "#FFCE56", "#4BC0C0", "#2b292f"
                                ),
                                Arrays.asList(
                                        "#090909", "#141415", "#FFCE56", "#4BC0C0", "#2b292f"
                                ),
                                Arrays.asList(
                                        "Titanic", "Ben Hur", "The English Patient", "My Fair Lady", "Gone with the Wnd"
                                ),
                                Arrays.asList(
                                        11, 11, 9, 8, 8
                                ),
                                new Coordinates(13, 0, 10, 7)
                        )
                )
        );





//        this.dashboardRepository.deleteAll();
//        dashboardList.add(football);
//        dashboardList.add(sales);
//        dashboardList.add(oscars);
//
//        for(Dashboard d : dashboardList) {
//            this.dashboardRepository.save(d);
//        }

    }
}
