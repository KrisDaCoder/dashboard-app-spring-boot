package com.kristjan.dashboardapp.controller;

import com.kristjan.dashboardapp.domain.Dashboard;
import com.kristjan.dashboardapp.service.ReactiveDashboardService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@CrossOrigin
@RestController
@RequestMapping("/api/sse")
public class ReactiveDashboardRestController {

    private ReactiveDashboardService reactiveDashboardService;

    public ReactiveDashboardRestController(ReactiveDashboardService reactiveDashboardService) {
        this.reactiveDashboardService = reactiveDashboardService;
    }

    @GetMapping(value = "/dashboards", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Dashboard> getDashboards() {
        return this.reactiveDashboardService.getDashboards();
    }

}