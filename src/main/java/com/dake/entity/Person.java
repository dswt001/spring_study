package com.dake.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @NotNull
    private String name;
    private String age;
    private Car car;
    private List<Car> cars;
}
