package org.example.repository.crudRepository;
import org.example.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client,Integer> {

}
