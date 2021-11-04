package com.josh_test.demo.assembler;

import com.josh_test.demo.controller.EmployeeController;
import com.josh_test.demo.entity.TestEmployee;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class EmployeeModelAssembler implements RepresentationModelAssembler<TestEmployee, EntityModel<TestEmployee>> {
    @Override
    public EntityModel<TestEmployee> toModel(TestEmployee employee) {
        return EntityModel.of(
                employee,
                linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
                linkTo(methodOn(EmployeeController.class).all()).withRel("employees")
                );
    }
}
