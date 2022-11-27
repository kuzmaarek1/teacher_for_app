import React from "react";
import { decode } from "html-entities";
import styles from "./Answer.module.scss";

const Answer = ({ index, letter, answer, handle, state }) => (
  <div
    className={[
      styles.answerWrapper,
      `${
        state[index] === `answer${letter}${index}`
          ? styles.answerWrapperActivate
          : styles.answerWrapperDeactivate
      }`,
    ].join(" ")}
    id={`answer` + letter + index}
    onClick={(event) => handle(event, index)}
  >
    <div className={styles.input} id={`answer` + letter + index}>
      {answer}
    </div>
    <div className={styles.clicked} id={`answer` + letter + index}>
      {state[index] === `answer${letter}${index}` ? decode("&#x2713") : ""}
    </div>
  </div>
);

export default Answer;
