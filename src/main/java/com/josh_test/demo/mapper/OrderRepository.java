package com.josh_test.demo.mapper;

import com.josh_test.demo.entity.TOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<TOrder, Long> {
}
