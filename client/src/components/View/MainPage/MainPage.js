import React from "react";
import Button from "../../Atoms/Button/Button.js";
import { NavLink } from "react-router-dom";
import styles from "./MainPage.module.scss";
import logo1 from './img/01.png';
import logo2 from './img/02.jpg';
import logo3 from './img/03.jpg';
import logo4 from './img/04.jpg';

const MainPage = () => {
  const slider = [{header:"Quiz PRO",description:"Sprawdź swoją wiedzę!", titleButton: "Rozwiąż quiz", link:"/quiz", img:logo1},
  {header:"Slide Viewer PRO" ,description:"Przeglądarka zdjęć z przedmiotu TWiJ", titleButton: "Zobacz wykłady", link:"/wyklady", img:logo2},
  {header:"Code Viewer PRO", description:"Przeglądarka kodów źródłowych przykładów", titleButton: "Zobacz skrypty", link:"/kody", img:logo3},
  {header:"Web Tools PRO", description:"Witryny z linkami i krótkim opisem narzędzi", titleButton: "Zobacz narzędzia", link:"/narzedzia", img:logo4}
];
  const [index, setIndex] = React.useState(0);
  const timeoutRef = React.useRef(null);
  function resetTimeout() {
    if (timeoutRef.current) {
      clearTimeout(timeoutRef.current);
    }
  }
  React.useEffect(() => {
    resetTimeout();
    timeoutRef.current = setTimeout(
      () =>
        setIndex((prevIndex) =>
          prevIndex === slider.length -1  ? 0 : prevIndex + 1
        ),
        5000
    );
    return () => {resetTimeout();};
  }, [index]);
  return (
    <>
    <div className={styles.slideshow}>
    <div
        className={styles.slideshowSlider}
        style={{ transform: `translate3d(${-index * 100}%, 0, 0)` }}
      >
        {slider.map(({header,description,titleButton,link,img})=>( 
        <div className={styles.wrapperSlide}>
          <div className={styles.slide}>
          <div className={styles.wrapperDescprition}>
          <h3 className={styles.header}>{header}</h3>
          <div className={styles.description}>{description}</div>
          <NavLink to={link} className={styles.link}>
            <Button
              class={styles.buttons}
              title={titleButton}
              handle={() => {}}
              state={false}
            />
          </NavLink>
        </div>
          <img className={styles.image} src={img} alt=""/>
        </div>
        </div>))}
      </div>      
      <div className={styles.slideshowDots}>
        {slider.map((_, idx) => 
          (
          <div
            key={idx}
            className={index === idx ? styles.slideshowDotIsActive : styles.slideshowDot}
            onClick={() => {
              setIndex(idx);
            }}
          ></div>))}
      </div>
    </div>
    </>
  );
};

export default MainPage;
