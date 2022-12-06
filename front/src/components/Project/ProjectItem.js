import React from "react";

export default function ProjectItem() {
  return (
    <div className="container">
      <div className="card card-body bg-light mb-3">
        <div className="row">
          <div className="col-2">
            <span className="mx-auto">REACT</span>
          </div>
          <div className="col-lg-6 col-md-4 col-8">
            <h3>Spring / React Project</h3>
            <p>Project to create a Kanban Board with Spring Boot and React</p>
          </div>
          <div className="col-md-4 d-none d-lg-block">
            <ul className="list-group">
              <a href="#">
                <li className="list-group-item board">
                  <i className="fa fa-flag-checkered">
                    <span className="ps-1">Project Board</span>
                  </i>
                </li>
              </a>
              <a href="#">
                <li className="list-group-item update">
                  <i className="fa fa-edit">
                    <span className="ps-1">Update Project Info</span>
                  </i>
                </li>
              </a>
              <a href="">
                <li className="list-group-item delete">
                  <i className="fa fa-minus-circle">
                    <span className="ps-1">Delete Project</span>
                  </i>
                </li>
              </a>
            </ul>
          </div>
        </div>
      </div>
    </div>
  );
}
