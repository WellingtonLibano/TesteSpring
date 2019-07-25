package br.com.wellington.testespring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.wellington.testespring.entity.TbSistema;
import br.com.wellington.testespring.repository.TbSistemasRepository;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	TbSistemasRepository tbSistemaRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		System.out.println("**Well** Este evento é acionado toda vez que a aplicação é iniciada");
		TbSistema tbSistema = new TbSistema();
		tbSistema.setDsSistema("Gerenciamento de Carteira");
		tbSistemaRepository.save(tbSistema);
		System.out.println(tbSistemaRepository.count());
		tbSistemaRepository.flush();
	}

}
