import "./App.css";
import "bootstrap/dist/css/bootstrap.css";
import Dashboard from "./components/Dashboard";
import Header from "./components/Layout/Header";

function App() {
  return (
    <div className="App">
      <Header />
      <Dashboard />
    </div>
  );
}

export default App;
