package io.spring.starterproject.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectName;
    private String projectIdentifier;
    private String description;
    private Instant start_date;
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
