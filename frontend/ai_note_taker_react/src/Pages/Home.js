import React from "react";

import MainNavBar from "../Components/Home/MainNavBar.js";
import MainBody from "../Components/Home/MainBody.js";
import MainFooter from "../Components/Home/MainFooter.js";

function Home() {
    return(
        <>
            <MainNavBar/>
            <MainBody/>
            <MainFooter/>
        </>
    );
}

export default Home;