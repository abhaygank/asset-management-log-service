package com.example.logservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "assignment_logs")
@Data @NoArgsConstructor @AllArgsConstructor
public class AssignmentLog {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;

    private Long assignmentId;

    private UUID assetId;

    // Tells the Log Service to look for "userEmail" in the incoming JSON
    @JsonProperty("userEmail")
    private String email;

    private String action;

    private LocalDateTime timestamp;
}