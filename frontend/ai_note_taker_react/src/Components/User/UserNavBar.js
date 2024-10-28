import React from "react";
import styles from "../../assets/css/UserNavBar.module.css";

const UserNavBar = () => {
    return (
        <>
                <nav className={styles["navbar"]}>
            <div className={styles["navbar-brand"]}>
                <a href="/">AI Note</a>
            </div>
            <ul className={styles["navbar-links"]}>
                <li><a href="/features">Features</a></li>
                <li><a href="/pricing">Pricing</a></li>
                <li><a href="/login">Login</a></li>
                <li><a href="/signup">Sign Up</a></li>
            </ul>
        </nav>
        </>
    );
}

export default UserNavBar;