import React from "react";
import ProjectItem from "./Project/ProjectItem";

export default function Dashboard() {
  return (
    <div>
      <h1 className="alert alert-warning">Welcome to the Dashboard</h1>
      <ProjectItem />
    </div>
  );
}
