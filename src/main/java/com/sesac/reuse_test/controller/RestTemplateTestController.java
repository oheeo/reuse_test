package com.sesac.reuse_test.controller;

import com.sesac.reuse_test.model.response.LogoutApiResponse;
import com.sesac.reuse_test.service.LogoutApiService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class RestTemplateTestController {

    private final LogoutApiService logoutApiService;

    @PostMapping
    public ResponseEntity<LogoutApiResponse> restTemplateTest1() {
        return ResponseEntity.ok(logoutApiService.callPostExternalServer());
    }
}

