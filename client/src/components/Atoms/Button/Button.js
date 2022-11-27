import React from "react";
import styles from "./Button.module.scss";

const Button = ({ title, handle, state }) => (
  <button
    type="submit"
    className={styles.button}
    onClick={() => handle()}
    disabled={state}
  >
    {title}
  </button>
);

export default Button;
