package com.rocket.code.rocketcode.model;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    private long id;
    @NotEmpty(message = "Campo no puede estar vacío!")
    private String title;

    @NotEmpty(message = "Campo no puede estar vacío!")
    private String description;

    @NotNull(message = "Campo no puede estar vacío!")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "start_date")
    private Date start_date;

}
