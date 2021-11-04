package com.josh_test.demo.config;

import com.josh_test.demo.entity.TOrder;
import com.josh_test.demo.entity.TestEmployee;
import com.josh_test.demo.enums.Status;
import com.josh_test.demo.mapper.EmployeeRepository;
import com.josh_test.demo.mapper.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDataBase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {
        return args -> {
            employeeRepository.save(new TestEmployee("Bilbo", "Baggins", "burglar"));
            employeeRepository.save(new TestEmployee("Frodo", "Baggins", "thief"));

            employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));

            orderRepository.save(new TOrder("MacBook Pro", Status.COMPLETED));
            orderRepository.save(new TOrder("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> log.info("Preloaded " + order));
        };
    }
}
