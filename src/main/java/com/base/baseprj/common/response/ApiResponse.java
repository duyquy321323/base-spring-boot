package com.base.baseprj.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

	private final int status;
	private final String message;
	private final T data;

    public ApiResponse(int status, String message) {
        this(status, message, null);
    }
}
