package com.kristjan.dashboardapp.service;

import com.kristjan.dashboardapp.domain.Dashboard;
import com.kristjan.dashboardapp.repository.ReactiveDashboardRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ReactiveDashboardServiceImpl implements ReactiveDashboardService {

    private ReactiveDashboardRepository reactiveDashboardRepository;

    public ReactiveDashboardServiceImpl(ReactiveDashboardRepository reactiveDashboardRepository) {
        this.reactiveDashboardRepository = reactiveDashboardRepository;
    }

    public Flux<Dashboard> getDashboards() {
        return this.reactiveDashboardRepository.findAll();
    }

}
