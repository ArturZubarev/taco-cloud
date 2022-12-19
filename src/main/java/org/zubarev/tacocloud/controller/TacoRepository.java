package org.zubarev.tacocloud.controller;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.zubarev.tacocloud.model.Taco;

import java.net.ContentHandler;

public interface TacoRepository extends PagingAndSortingRepository<Taco,Long> {
    public Iterable<Taco> findAll();
}
