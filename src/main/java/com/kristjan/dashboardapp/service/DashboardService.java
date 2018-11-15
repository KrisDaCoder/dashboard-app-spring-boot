package com.kristjan.dashboardapp.service;

import com.kristjan.dashboardapp.domain.Dashboard;

import java.util.List;
import java.util.Optional;

public interface DashboardService {

    List<Dashboard> getDashboards();
    void saveDashboard(Dashboard dashboard);
    Optional<Dashboard> getDashboard(String id);
    void deleteDashboard(String id);

}
