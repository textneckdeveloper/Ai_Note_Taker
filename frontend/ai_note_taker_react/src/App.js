import { Routes, Route } from 'react-router-dom';

import Home from "./Pages/Home.js";
import User from "./Pages/User.js";

function App() {
  return (
    <>
        <Routes>
          <Route path="/" element = {<Home/>}/>
          <Route path="/user" element = {<User/>}/>
        </Routes>
    </>
  );
}

export default App;
