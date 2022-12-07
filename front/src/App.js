import "./App.css";
import "bootstrap/dist/css/bootstrap.css";
import Dashboard from "./components/Dashboard";
import Navbar from "./components/Layout/Navbar";
import AddProject from "./components/Project/AddProject";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

function App() {
  return (
    <Router>
      <div className="App">
        <Navbar />
        <Routes>
          <Route exact path="/" element={<Dashboard />} />
          <Route exact path="/addProject" element={<AddProject />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
