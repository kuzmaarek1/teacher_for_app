import React from "react";
import styles from "./Title.module.scss";

const Title = ({ index, description }) => (
  <div>
    <pre className={styles.description} key={"answer" + index}>
      {index === null ? "" : `${index + 1}.`} {description}
    </pre>
  </div>
);

export default Title;
