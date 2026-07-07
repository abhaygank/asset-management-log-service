package com.example.logservice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "assignment_logs")
@Data @NoArgsConstructor @AllArgsConstructor
public class AssignmentLog {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;
    private Long assignmentId;
    private String assetId;
    private Long userId;
    private String action;
    private LocalDateTime timestamp;
}
