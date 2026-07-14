package com.example.logservice.controller;

import com.example.logservice.entity.UserLog;
import com.example.logservice.service.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/logs/users")
public class UserLogController {
    @Autowired private UserLogService service;

    @PostMapping
    public ResponseEntity<Void> createLog(@RequestBody UserLog log) {
        service.saveLog(log);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/{email}")
    public ResponseEntity<List<UserLog>> getLogs(@PathVariable String email) { // Updated
        return ResponseEntity.ok(service.getLogsByEmail(email));
    }
}