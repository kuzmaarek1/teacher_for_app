import React from "react";
import styles from "./Header.module.scss";
import { NavLink } from "react-router-dom";

const Header = () => {
  const Links = [
    { href: `/quiz`, description: "Quiz" },
    { href: `/wyklady`, description: "Wykłady" },
    { href: `/kody`, description: "Kody źródłowe" },
    { href: `/narzedzia`, description: "Narzędzia" },
  ];
  return (
    <div className={styles.wrapper}>
      <NavLink className={styles.title} to="/">
        JAVA PRO
      </NavLink>
      <div className={styles.links}>
        {Links.map(({ href, description }) => (
          <NavLink
            className={styles.link}
            activeClassName={styles.linkIsActive}
            to={href}
          >
            {description}
          </NavLink>
        ))}
      </div>
    </div>
  );
};

export default Header;
