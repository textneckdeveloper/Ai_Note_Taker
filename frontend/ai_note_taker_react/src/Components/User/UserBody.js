import React from "react";
import styles from "../../assets/css/UserBody.module.css";

const UserBody = () => {
    return (
        <>
        <div className={styles["body-container"]}>
            <h1>AI 자동 메모 작성 시스템</h1>
            <p>이 시스템은 사용자의 입력을 바탕으로 자동으로 메모를 생성합니다.</p>
            <div className={styles["note-section"]}>
                <h2>작성된 메모</h2>
                {/* 메모 리스트를 표시할 영역 */}
                <ul className={styles["note-list"]}>
                    <li>메모 1</li>
                    <li>메모 2</li>
                    <li>메모 3</li>
                </ul>
            </div>
        </div>
        </>
    );
}

export default UserBody;