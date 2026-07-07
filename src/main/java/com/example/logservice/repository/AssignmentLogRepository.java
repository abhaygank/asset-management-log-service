package com.example.logservice.repository;



import com.example.logservice.entity.AssignmentLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AssignmentLogRepository extends JpaRepository<AssignmentLog, Long> {
    List<AssignmentLog> findByAssetIdOrderByTimestampDesc(String assetId);
    List<AssignmentLog> findByUserIdOrderByTimestampDesc(Long userId);
}