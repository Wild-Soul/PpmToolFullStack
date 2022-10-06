package io.spring.starterproject.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Project name is required.")
    private String projectName;

    @NotBlank(message = "Project name is required.")
    @Size(min = 4, max = 5)
    @Column(nullable = false, unique = true)
    private String projectIdentifier;

    @NotBlank(message = "Project name is required.")
    private String description;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Instant start_date;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Instant end_date;

    private Instant created_At;
    private Instant updated_At;

    @PrePersist
    protected void onCreate() {
        this.created_At = Instant.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updated_At = Instant.now();
    }
}
