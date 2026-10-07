package com.base.baseprj.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

	private final boolean success;
	private final int status;
	private final String message;
	private final T data;

	public static <T> ApiResponse<T> ok(T data) {
		return new ApiResponse<>(true, 200, "Success", data);
	}

	public static <T> ApiResponse<T> ok(String message, T data) {
		return new ApiResponse<>(true, 200, message, data);
	}

	public static <T> ApiResponse<T> error(int status, String message) {
		return new ApiResponse<>(false, status, message, null);
	}

	public static <T> ApiResponse<T> error(int status, String message, T data) {
		return new ApiResponse<>(false, status, message, data);
	}
}
