package com.example.springcassandra.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(value = "cyclist_category")
public class CyclistCategory {
    @PrimaryKeyColumn(ordinal = 0,type = PrimaryKeyType.PARTITIONED)
    private String category;
    @PrimaryKeyColumn(ordinal = 1,type = PrimaryKeyType.CLUSTERED, ordering = Ordering.DESCENDING)
    private int points;
    private UUID id;
    private String lastname;
}
