package com.example.logservice.repository;



import com.example.logservice.entity.AssetLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AssetLogRepository extends JpaRepository<AssetLog, Long> {
    List<AssetLog> findByAssetIdOrderByTimestampDesc(String assetId);
}
