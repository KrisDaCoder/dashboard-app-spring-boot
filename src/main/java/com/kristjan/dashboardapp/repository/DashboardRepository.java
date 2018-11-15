package com.kristjan.dashboardapp.repository;

import com.kristjan.dashboardapp.domain.Dashboard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashboardRepository extends MongoRepository<Dashboard, String> {
}
