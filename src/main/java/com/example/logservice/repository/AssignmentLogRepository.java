package com.example.logservice.repository;



import com.example.logservice.entity.AssignmentLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface AssignmentLogRepository extends JpaRepository<AssignmentLog, Long> {
    List<AssignmentLog> findByAssetIdOrderByTimestampDesc(UUID assetId);
    List<AssignmentLog> findByUserIdOrderByTimestampDesc(UUID userId);
}