package com.example.logservice.service;

import com.example.logservice.entity.UserLog;
import com.example.logservice.repository.UserLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserLogService {
    @Autowired private UserLogRepository repository;

    @Async
    public void saveLog(UserLog log) {
        log.setTimestamp(LocalDateTime.now());
        repository.save(log);
    }

    public List<UserLog> getLogsByUserId(Long userId) {
        return repository.findByUserIdOrderByTimestampDesc(userId);
    }
}