package br.com.daysesoares.queue;

import java.util.function.Consumer;

import org.springframework.stereotype.Component;

import br.com.daysesoares.model.AppModel;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AppCreatedEventListener implements Consumer<AppModel>{
	
	@Override
	public void accept(AppModel t) {
		log.info("App Criado foi recebido");
		
	}

}
