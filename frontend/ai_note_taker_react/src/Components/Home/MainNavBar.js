import React from "react";
import "../../assets/css/MainNavBar.css";

const MainNavBar = () => {
    return (
        <nav className="navbar">
            <div className="navbar-brand">
                <a href="/">AI Note</a>
            </div>
            <ul className="navbar-links">
                <li><a href="/features">Features</a></li>
                <li><a href="/pricing">Pricing</a></li>
                <li><a href="/login">Login</a></li>
                <li><a href="/signup">Sign Up</a></li>
            </ul>
        </nav>
    );
}

export default MainNavBar;