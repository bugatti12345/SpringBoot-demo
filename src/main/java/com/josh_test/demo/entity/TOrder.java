package com.josh_test.demo.entity;

import com.josh_test.demo.enums.Status;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "CUSTOMER_ORDER")
public class TOrder {

    private @Id
    @GeneratedValue
    Long id;
    private String description;
    private Status status;

    public TOrder() {}

    public TOrder(String description, Status status) {
        this.description = description;
        this.status = status;
    }

    public Long getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TOrder))
            return false;
        TOrder order = (TOrder) o;
        return Objects.equals(this.id, order.id) && Objects.equals(this.description, order.description)
        && Objects.equals(this.status, order.status);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.description, this.description);
    }

    @Override
    public String toString(){
        return "Order{" + "id=" + this.id + ", description='" + this.description + '\'' +
                ", status=" + this.status + '}';
    }
}
