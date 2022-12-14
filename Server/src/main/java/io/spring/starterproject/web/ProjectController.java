package io.spring.starterproject.web;

import io.spring.starterproject.domain.Project;
import io.spring.starterproject.services.MapValidationErrorService;
import io.spring.starterproject.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @PostMapping("")
    public ResponseEntity<?> createNewProject(
            @Valid @RequestBody Project project,
            BindingResult result
    ) {

        ResponseEntity<?> errorMap = mapValidationErrorService.mapValidation(result);
        if (errorMap != null) {
            return errorMap;
        }

        Project response = projectService.saveOrUpdateProject(project);
        return new ResponseEntity<>(project, HttpStatus.CREATED);
    }

    @GetMapping("/{projectId}")
    public ResponseEntity<?> findByProjectId(@PathVariable String projectId) {
        Project project = projectService.findByProjectIdentifier(projectId);

        return new ResponseEntity<>(project, HttpStatus.OK);
    }

    @GetMapping("/all")
    public Iterable<Project> getAllProjects() {
        return projectService.findAllProjects();
    }

    @DeleteMapping("/{projectId}")
    public ResponseEntity<?> deleteProject(@PathVariable String projectId) {
        projectService.deleteProjectByIdentifier(projectId);
        return new ResponseEntity<>("Project with Id " + projectId + " is deleted!", HttpStatus.OK);
    }
}
