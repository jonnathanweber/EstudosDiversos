package br.com.alura.resource;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import br.com.alura.model.Ordem;
import br.com.alura.repository.OrdemRepository;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

/*
 * usuario efetua requisicao no link /ordens
 */
@Path("/ordens")
public class OrdemResource {
    @Inject
    OrdemRepository ordemRepository;

    @POST
    @Transactional
    @RolesAllowed("user")
    @Consumes(MediaType.APPLICATION_JSON)
    public void inserir(Ordem ordem) {
        ordem.setData("2023-06-21");
        ordem.setStatus("Enviada");
        ordemRepository.persist(ordem);
    } 
}
