package org.zubarev.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import org.zubarev.tacocloud.model.Taco;
import org.zubarev.tacocloud.model.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder,String> {


}
