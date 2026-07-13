package com.example.logservice.repository;


import com.example.logservice.entity.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface UserLogRepository extends JpaRepository<UserLog, Long> {
    List<UserLog> findByUserIdOrderByTimestampDesc(UUID userId);
}