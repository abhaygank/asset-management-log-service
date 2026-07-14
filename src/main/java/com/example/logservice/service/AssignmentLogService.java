package com.example.logservice.service;

import com.example.logservice.entity.AssignmentLog;
import com.example.logservice.repository.AssignmentLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class AssignmentLogService {
    @Autowired private AssignmentLogRepository repository;

    @Async
    public void saveLog(AssignmentLog log) {
        log.setTimestamp(LocalDateTime.now());
        repository.save(log);
    }

    public List<AssignmentLog> getLogsByAssetId(UUID assetId) {
        return repository.findByAssetIdOrderByTimestampDesc(assetId);
    }

    
    public List<AssignmentLog> getLogsByEmail(String email) {
        return repository.findByEmailOrderByTimestampDesc(email);
    }
}