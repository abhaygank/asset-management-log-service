package com.example.logservice.controller;

import com.example.logservice.entity.AssetLog;
import com.example.logservice.service.AssetLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/logs/assets")
public class AssetLogController {
    @Autowired private AssetLogService service;

    @PostMapping
    public ResponseEntity<Void> createLog(@RequestBody AssetLog log) {
        service.saveLog(log);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/{assetId}")
    public ResponseEntity<List<AssetLog>> getLogs(@PathVariable UUID assetId) {
        return ResponseEntity.ok(service.getLogsByAssetId(assetId));
    }
}