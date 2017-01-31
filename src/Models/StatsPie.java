package Models;

import javafx.collections.ObservableList;

import java.util.ArrayList;

public class StatsPie {

    private ArrayList<StatsData> _statsData;

    private StatsData _unoccupied;
    private StatsData _passholders;
    private StatsData _adhoc;
    private StatsData _reservations;

    public StatsPie() {
        _statsData = new ArrayList<>();
        reset();
    }

    public void reset() {
        _unoccupied = new StatsData("Unoccupied", 100);
        _passholders = new StatsData("Pass holders");
        _adhoc = new StatsData("Adhoc");
        _reservations = new StatsData("Reservations");
    }

    public void update(int total, int unoccupied, int passHolders, int adhoc, int reservations) {
        double percentageUnoccupied = (unoccupied / total) * 100;
        double percentagePassHolders = (passHolders / total) * 100;
        double percentageAdHoc = (adhoc / total) * 100;
        double percentageReservations = (reservations / total) * 100;
        double percentageTotal = percentageAdHoc + percentagePassHolders + percentageReservations + percentageUnoccupied;

        if (percentageTotal < 100)
            percentageUnoccupied += (100 - percentageTotal);

        _unoccupied.setPercentage(percentageUnoccupied);
        _passholders.setPercentage(percentagePassHolders);
        _adhoc.setPercentage(percentageAdHoc);
        _reservations.setPercentage(percentageReservations);
    }

    public StatsData getUnoccupied() {
        return _unoccupied;
    }

    public StatsData getPassHolders() {
        return _passholders;
    }

    public StatsData getAdHoc() {
        return _adhoc;
    }

    public StatsData getReservations() {
        return _reservations;
    }
}