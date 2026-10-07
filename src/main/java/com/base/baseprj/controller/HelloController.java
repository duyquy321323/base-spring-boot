package com.base.baseprj.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.base.baseprj.common.exception.AppException;
import com.base.baseprj.common.response.ApiResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Hello")
@RestController
@RequestMapping("/api/hello")
public class HelloController {

	@Operation(summary = "Success response mẫu")
	@GetMapping
	public ApiResponse<String> hello() {
		return ApiResponse.ok("Hello World");
	}

	@Operation(summary = "Error response mẫu")
	@GetMapping("/error")
	public ApiResponse<Void> error() {
		throw new AppException(HttpStatus.BAD_REQUEST, "Đây là lỗi mẫu");
	}
}
