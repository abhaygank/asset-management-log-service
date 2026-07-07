package com.example.logservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_logs")
@Data @NoArgsConstructor @AllArgsConstructor
public class UserLog {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;
    private Long userId;
    private String action;
    private LocalDateTime timestamp;
    private String details;
}