package br.com.daysesoares.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.daysesoares.model.AppModel;
import br.com.daysesoares.queue.AppEventGateway;

@Service
public class AppService {
	
	@Autowired
	private AppEventGateway appEventGateway;

	public AppModel atualizaApp(AppModel obj) {
		String nome = "Atualizado: "+ obj.getName();
		obj.setName(nome);
		appEventGateway.sendAppUpdateEvent(obj);
		return obj;
	}

	public AppModel novoApp(AppModel obj) {
		String nome = "Novo: "+ obj.getName();
		obj.setName(nome);
		appEventGateway.sendAppCreatedEvent(obj);
		return obj;
	}

}
