package br.com.daysesoares.queue;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

import br.com.daysesoares.config.AppProperties;
import br.com.daysesoares.model.AppModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class AppEventGatewayWithSteramBridge implements AppEventGateway {

	private final StreamBridge streamBridge;
	private final AppProperties appProperties;
	
	@Override
	public void sendAppCreatedEvent(AppModel value) {
		log.info("App Criado {} ", value);
		streamBridge.send(appProperties.getAppCreatedChannel(), value);
		
	}

	@Override
	public void sendAppUpdateEvent(AppModel value) {
		log.info("App Atualizado {} ", value);
		streamBridge.send(appProperties.getAppUpdateChannel(), value);
		
	}

}
