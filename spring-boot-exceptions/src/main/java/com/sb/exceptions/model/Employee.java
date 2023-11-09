package com.sb.exceptions.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Employee {
    private Integer id;
    private String name;
    private String gender;
}
