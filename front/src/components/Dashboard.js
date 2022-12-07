import React from "react";
import CreateProjectButton from "./Project/CreateProjectButton";
import ProjectItem from "./Project/ProjectItem";

export default function Dashboard() {
  return (
    <div className="projects">
      <div className="container">
        <div className="row">
          <div className="col-md-12">
            <h1 className="display-4 text-center">Projects</h1>
            <br />
            <CreateProjectButton />
            <br />
            <hr />

            {/* Project Items */}
            <ProjectItem />
          </div>
        </div>
      </div>
    </div>
  );
}
