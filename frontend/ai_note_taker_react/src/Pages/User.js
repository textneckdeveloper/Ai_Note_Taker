import React from "react";

import UserNavBar from "../Components/User/UserNavBar.js";
import UserBody from "../Components/User/UserBody.js";
import UserFooter from "../Components/User/UserFooter.js";

function User() {
    return(
        <>
            <UserNavBar/>
            <UserBody/>
            <UserFooter/>
        </>
    );
}

export default User;