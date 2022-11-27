import React from "react";
import Title from "../../Atoms/Title/Title.js";
import Button from "../../Atoms/Button/Button.js";
import styles from "./Result.module.scss";
import { NavLink } from "react-router-dom";

const Result = (props) => (
  <div class={styles.wrapper}>
    <Title
      index={null}
      description={`Zdobyłeś ${props.location.state.result} punktów.\n Liczba możliwych punktów do uzyskania: ${props.location.maxResult}`}
    />
    <NavLink to="/quiz" className={styles.link}>
      <Button
        class={styles.buttons}
        title={"Rozwiąz test jeszcze raz"}
        handle={() => {}}
        state={false}
      />
    </NavLink>
  </div>
);

export default Result;
