package com.example.logservice.controller;

import com.example.logservice.entity.AssignmentLog;
import com.example.logservice.service.AssignmentLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/logs/assignments")
public class AssignmentLogController {
    @Autowired private AssignmentLogService service;

    @PostMapping
    public ResponseEntity<Void> createLog(@RequestBody AssignmentLog log) {
        service.saveLog(log);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/{assetId}")
    public ResponseEntity<List<AssignmentLog>> getLogs(@PathVariable String assetId) {
        return ResponseEntity.ok(service.getLogsByAssetId(assetId));
    }
}
