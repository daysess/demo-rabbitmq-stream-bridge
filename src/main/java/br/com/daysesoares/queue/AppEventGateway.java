package br.com.daysesoares.queue;

import br.com.daysesoares.model.AppModel;

public interface AppEventGateway {

	
	void sendAppCreatedEvent(AppModel value);
	void sendAppUpdateEvent(AppModel value);
	
	
}
