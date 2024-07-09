package com.aphtec.api.repositores;

import com.aphtec.api.models.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {}
