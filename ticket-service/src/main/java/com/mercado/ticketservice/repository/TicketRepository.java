package com.mercado.ticketservice.repository;


import com.mercado.ticketservice.domain.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

    Ticket findTicketByNumeroPremiado(Integer numeroPremiado);

    Ticket findAllByProdutoid(Integer produtoId);

}