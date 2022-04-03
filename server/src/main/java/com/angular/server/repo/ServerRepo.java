package com.angular.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angular.server.model.Server;

public interface ServerRepo extends JpaRepository<Server, Long > {
	Server findByIpAddress(String ipAddress);

}
