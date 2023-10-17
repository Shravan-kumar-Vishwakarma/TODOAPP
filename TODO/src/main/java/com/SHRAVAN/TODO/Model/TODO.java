package com.SHRAVAN.TODO.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TODO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer todoId;
    private String todoName;
    private boolean todoStatus;
}
