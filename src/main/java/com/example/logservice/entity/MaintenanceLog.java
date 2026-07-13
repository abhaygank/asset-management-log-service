package com.example.logservice.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "maintenance_logs")
@Data @NoArgsConstructor @AllArgsConstructor
public class MaintenanceLog {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;
    private UUID maintenanceId;
    private UUID assetId;
    private String status;
    private LocalDateTime timestamp;
}