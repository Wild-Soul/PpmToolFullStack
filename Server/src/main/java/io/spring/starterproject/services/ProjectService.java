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

    public Project findByProjectIdentifier(String projectId) {
        Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());

        if(project == null) {
            throw new ProjectIdException(
                String.format(
                    "Project ID %s does not exists!", projectId
                )
            );
        }

        return project;
    }

    public  Iterable<Project> findAllProjects() {
        return projectRepository.findAll();
    }

    public void deleteProjectByIdentifier(String projectId) {
        Project project = projectRepository.findByProjectIdentifier(projectId);

        if(project == null) {
            throw new ProjectIdException(
                String.format(
                    "Cannot delete project with Id %s as it does not exists!", projectId
                )
            );
        }

        projectRepository.delete(project);
    }
}
