package com.example.logservice.controller;

import com.example.logservice.entity.MaintenanceLog;
import com.example.logservice.service.MaintenanceLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/logs/maintenance")
public class MaintenanceLogController {
    @Autowired private MaintenanceLogService service;

    @PostMapping
    public ResponseEntity<Void> createLog(@RequestBody MaintenanceLog log) {
        service.saveLog(log);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/{assetId}")
    public ResponseEntity<List<MaintenanceLog>> getLogs(@PathVariable String assetId) {
        return ResponseEntity.ok(service.getLogsByAssetId(assetId));
    }
}
