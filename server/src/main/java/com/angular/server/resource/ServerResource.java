package com.angular.server.resource;


import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angular.server.model.Response;
import com.angular.server.service.implmentation.ServerServiceImpl;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/server")
@RequiredArgsConstructor
public class ServerResource {
	private final ServerServiceImpl serviceService;
	
	public ResponseEntity<Response> getServers() {
		return ResponseEntity.ok(
				Response.builder()
					.timeStamp(now())
					.data(Map.of("servers", serverService.list(30)))
					.message("Servers retrieved")
					.status(OK)
					.statusCode(OK.value())
					.build()
				);
		}
	}

}
