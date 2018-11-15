package com.kristjan.dashboardapp.service;

import com.kristjan.dashboardapp.domain.Dashboard;
import reactor.core.publisher.Flux;

public interface ReactiveDashboardService {

    Flux<Dashboard> getDashboards();

}
