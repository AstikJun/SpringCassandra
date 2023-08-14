package com.example.springcassandra.repo;

import com.example.springcassandra.entity.CyclistCategory;
import org.springframework.data.cassandra.repository.MapIdCassandraRepository;

public interface CyclistCategoryRepository extends MapIdCassandraRepository<CyclistCategory> {
}
