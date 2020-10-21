package com.falabella.catalyst.network.repository;

import com.falabella.catalyst.network.entity.Operator;
import com.falabella.catalyst.network.entity.ResourceCapacity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperatorRepository extends JpaRepository<Operator,Long> {
}
