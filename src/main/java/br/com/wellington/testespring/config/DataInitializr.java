package br.com.wellington.testespring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.wellington.testespring.entity.TbRotina;
import br.com.wellington.testespring.entity.TbSistema;
import br.com.wellington.testespring.repository.TbRotinaRepository;
import br.com.wellington.testespring.repository.TbSistemasRepository;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	TbSistemasRepository tbSistemaRepository;

	@Autowired
	TbRotinaRepository tbRotinaRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		System.out.println("**Well** Este evento é acionado toda vez que a aplicação é iniciada");

		if (tbSistemaRepository.count() == 0) {
			TbSistema tbSistema = new TbSistema();
			tbSistema.setDsSistema("Gerenciamento de Carteira");
			tbSistemaRepository.save(tbSistema);
		}

		if (tbRotinaRepository.count() == 0) {
			TbRotina tbRotina = new TbRotina();
			tbRotina.setIdSistema(1);
			tbRotina.setDsRotina("Cadastro de Sistemas");
			tbRotinaRepository.save(tbRotina);

			tbRotina = new TbRotina();
			tbRotina.setIdSistema(1);
			tbRotina.setDsRotina("Cadastro de Usuarios");
			tbRotinaRepository.save(tbRotina);

			tbRotina = new TbRotina();
			tbRotina.setIdSistema(1);
			tbRotina.setDsRotina("Calculo Rating");
			tbRotinaRepository.save(tbRotina);
		}
	}
}
