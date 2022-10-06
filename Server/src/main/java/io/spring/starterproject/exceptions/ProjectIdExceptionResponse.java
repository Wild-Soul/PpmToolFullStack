package io.spring.starterproject.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectIdExceptionResponse {
    private String projectIdentifier;

    public ProjectIdExceptionResponse(String message) {
        projectIdentifier = message;
    }
}
