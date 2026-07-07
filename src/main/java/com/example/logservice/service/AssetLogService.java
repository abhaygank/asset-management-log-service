package com.example.logservice.service;



import com.example.logservice.entity.AssetLog;
import com.example.logservice.repository.AssetLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class AssetLogService {
    @Autowired private AssetLogRepository repository;

    @Async
    public void saveLog(AssetLog log) {
        log.setTimestamp(LocalDateTime.now());
        repository.save(log);
    }

    public List<AssetLog> getLogsByAssetId(String assetId) {
        return repository.findByAssetIdOrderByTimestampDesc(assetId);
    }
}
