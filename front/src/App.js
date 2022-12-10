import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import { Provider } from "react-redux";

import Dashboard from "./components/Dashboard";
import Navbar from "./components/Layout/Navbar";
import AddProject from "./components/Project/AddProject";
import store from "./store";

import "bootstrap/dist/css/bootstrap.css";
import "./App.css";

function App() {
  return (
    <Provider store={store}>
      <Router>
        <div className="App">
          <Navbar />
          <Routes>
            <Route exact path="/" element={<Dashboard />} />
            <Route exact path="/addProject" element={<AddProject />} />
          </Routes>
        </div>
      </Router>
    </Provider>
  );
}

export default App;
