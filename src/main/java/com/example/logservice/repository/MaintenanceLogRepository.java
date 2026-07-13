package com.example.logservice.repository;



import com.example.logservice.entity.MaintenanceLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface MaintenanceLogRepository extends JpaRepository<MaintenanceLog, Long> {
    List<MaintenanceLog> findByAssetIdOrderByTimestampDesc(UUID assetId);
}