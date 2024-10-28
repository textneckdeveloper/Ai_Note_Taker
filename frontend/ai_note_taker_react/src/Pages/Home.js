import React from "react";

import "../assets/css/Home.css";

import NavBar from "../Components/Home/NavBar.js";
import Body from "../Components/Home/Body.js";
import Footer from "../Components/Home/Footer.js";

function Home() {
    return(
        <>
            <NavBar/>
            <Body/>
            <Footer/>
        </>
    );
}

export default Home;