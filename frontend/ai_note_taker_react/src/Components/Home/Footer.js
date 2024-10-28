import React from "react";
import "../../assets/css/Footer.css";

const Footer = () => {
    return (
        <footer className="footer">
            <p>&copy; 2024 AI 자동 메모 작성 시스템. 모든 권리 보유.</p>
            <ul className="footer-links">
                <li><a href="/about">About Us</a></li>
                <li><a href="/privacy">Privacy Policy</a></li>
                <li><a href="/contact">Contact</a></li>
            </ul>
        </footer>
    );
}

export default Footer;
