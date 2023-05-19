package com.adel.cqrskafka.entities.repository;

import com.adel.cqrskafka.entities.model.Logs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogsRepository extends CrudRepository<Logs, String> {
}
