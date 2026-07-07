package com.example.logservice.service;

import com.example.logservice.entity.MaintenanceLog;
import com.example.logservice.repository.MaintenanceLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MaintenanceLogService {
    @Autowired private MaintenanceLogRepository repository;

    @Async
    public void saveLog(MaintenanceLog log) {
        log.setTimestamp(LocalDateTime.now());
        repository.save(log);
    }

    public List<MaintenanceLog> getLogsByAssetId(String assetId) {
        return repository.findByAssetIdOrderByTimestampDesc(assetId);
    }
}
