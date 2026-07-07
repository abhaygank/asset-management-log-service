package com.example.logservice.service;



import com.example.logservice.entity.AssignmentLog;
import com.example.logservice.repository.AssignmentLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class AssignmentLogService {
    @Autowired private AssignmentLogRepository repository;

    @Async
    public void saveLog(AssignmentLog log) {
        log.setTimestamp(LocalDateTime.now());
        repository.save(log);
    }

    public List<AssignmentLog> getLogsByAssetId(String assetId) {
        return repository.findByAssetIdOrderByTimestampDesc(assetId);
    }
}
