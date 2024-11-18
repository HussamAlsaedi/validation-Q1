package org.example.lap51.Model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private int id;

    @NotEmpty(message = "Title must not be empty")
    @Size(min = 8, message = "Title must be at least 8 characters long")
    private String title;

    @NotEmpty(message = "Description must not be empty")
    @Size(min = 15, message = "Description must be at least 15 characters long")
    private String description;

    @NotEmpty(message = "Status must not be empty")
    @Pattern(
            regexp = "Not done|in progress|complete",
            message = "Status must be one of the following: Not done, in progress, or complete"
    )
    private String status;

    @NotEmpty(message = "company Name must not be empty")
    @Size(min = 6, message = "company Name must be at least 6 characters long")
    private String companyName;

}
