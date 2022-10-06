package io.spring.starterproject.services;

import io.spring.starterproject.domain.Project;
import io.spring.starterproject.exceptions.ProjectIdException;
import io.spring.starterproject.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        } catch (Exception e) {
            throw new ProjectIdException(
                String.format(
                    "Project ID %s already exists!",
                    project.getProjectIdentifier().toUpperCase()
                )
            );
        }
    }
}
