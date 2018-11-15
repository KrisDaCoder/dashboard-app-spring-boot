package com.kristjan.dashboardapp.repository;

import com.kristjan.dashboardapp.domain.Dashboard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactiveDashboardRepository extends ReactiveMongoRepository<Dashboard, String> {

}
