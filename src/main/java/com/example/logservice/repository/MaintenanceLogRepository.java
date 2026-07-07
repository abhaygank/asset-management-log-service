package com.example.logservice.repository;



import com.example.logservice.entity.MaintenanceLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MaintenanceLogRepository extends JpaRepository<MaintenanceLog, Long> {
    List<MaintenanceLog> findByAssetIdOrderByTimestampDesc(String assetId);
}