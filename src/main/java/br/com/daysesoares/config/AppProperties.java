package br.com.daysesoares.config;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AppProperties {

	private String appCreatedChannel = "appCreatedSupplier-out-0";
	
	private String appUpdateChannel = "appUpdateSupplier-out-0";
	
}
