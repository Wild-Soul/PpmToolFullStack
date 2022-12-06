import "./App.css";
import "bootstrap/dist/css/bootstrap.css";
import Dashboard from "./components/Dashboard";
import Navbar from "./components/Layout/Navbar";

function App() {
  return (
    <div className="App">
      <Navbar />
      <Dashboard />
    </div>
  );
}

export default App;
