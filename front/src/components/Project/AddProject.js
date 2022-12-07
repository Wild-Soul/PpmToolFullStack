import React, { useState } from "react";

export default function () {
  const [state, setState] = useState({
    projectName: "",
    projectIdentifier: "",
    description: "",
    start_date: "",
    end_date: "",
  });

  const onInputChange = (event) => {
    let inputChangedFor = event.target.name;
    let newState = {
      ...state,
      [inputChangedFor]: event.target.value,
    };
    setState(newState);
  };

  const onSubmit = (e) => {
    e.preventDefault();

    const newProject = {
      projectName: state.projectName,
      projectIdentifier: state.projectIdentifier,
      description: state.description,
      start_date: state.start_date,
      end_date: state.end_date,
    };

    console.log("New project payload:", newProject);
  };

  return (
    <div className="project">
      <div className="container">
        <div className="row">
          <div className="col-md-8 m-auto">
            <h5 className="display-4 text-center">
              Create / Edit Project form
            </h5>
            <hr />
            <form onSubmit={onSubmit}>
              <div className="form-group">
                <input
                  type="text"
                  className="form-control form-control-lg "
                  placeholder="Project Name"
                  name="projectName"
                  value={state.projectName}
                  onChange={onInputChange}
                />
              </div>
              <div className="form-group">
                <input
                  type="text"
                  className="form-control form-control-lg"
                  placeholder="Unique Project ID"
                  name="projectIdentifier"
                  value={state.projectIdentifier}
                  onChange={onInputChange}
                />
              </div>
              {/* disabled for Edit Only!! remove "disabled" for the Create operation */}
              <div className="form-group">
                <textarea
                  className="form-control form-control-lg"
                  placeholder="Project Description"
                  value={state.description}
                  name="description"
                  onChange={onInputChange}
                ></textarea>
              </div>
              <h6>Start Date</h6>
              <div className="form-group">
                <input
                  type="date"
                  className="form-control form-control-lg"
                  name="start_date"
                  value={state.start_date}
                  onChange={onInputChange}
                />
              </div>
              <h6>Estimated End Date</h6>
              <div className="form-group">
                <input
                  type="date"
                  className="form-control form-control-lg"
                  name="end_date"
                  value={state.end_date}
                  onChange={onInputChange}
                />
              </div>

              <input type="submit" className="btn btn-primary btn-block mt-4" />
            </form>
          </div>
        </div>
      </div>
    </div>
  );
}
