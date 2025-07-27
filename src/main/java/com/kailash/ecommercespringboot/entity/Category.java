package com.kailash.ecommercespringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="category")
public class Category extends BaseEntity {

    private String name;

    @OneToMany(mappedBy="category")
    private List<Product> products;
}
