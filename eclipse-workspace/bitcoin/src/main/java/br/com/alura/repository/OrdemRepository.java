package br.com.alura.repository;

import br.com.alura.model.Ordem;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

/*
Alocacao de memoria para o sistema. Depende do projeto
para ser mais ou menos eficiente. 
Scoped = 1 instancia para todas as requisicoes
RequestScoped = varias instancias na memoria
*/
@ApplicationScoped
public class OrdemRepository implements PanacheRepository<Ordem>{
    
}
