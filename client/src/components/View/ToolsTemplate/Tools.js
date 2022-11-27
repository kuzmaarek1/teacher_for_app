import React from "react";
import UserService from "../../../services/UserService";
import Title from "../../Atoms/Title/Title.js";
import Button from "../../Atoms/Button/Button.js";
import styles from "./Tools.module.scss";

class Narzedzia extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      webTools: [],
      namberTools: 0,
    };
  }

  componentDidMount() {
    UserService.getWebTools().then((response) => {
      this.setState({
        webTools: response.data,
      });
    });
  }

  handleButtonChange = (number) => {
    this.setState({
      namberTools: this.state.namberTools + number,
    });
  };

  render() {
    const { webTools, namberTools } = this.state;
    const { wrapper, buttonsGrid } = styles;
    const count = webTools.length;
    return (
      <div className={wrapper}>
        {webTools.map((webTools, index) => {
          return (
            index === namberTools && (
              <>
                <Title index={index} description={webTools.title} />
                <div className={styles.description}>
                  {webTools.image && (
                    <img
                    className={styles.img}
                      src={"data:image/png;base64, " + webTools.image}
                      alt=""
                    />
                  )}
                  <div>{webTools.description}</div>
                </div>
                <div className={buttonsGrid}>
                  <Button
                    title={"Wcześniejsze"}
                    handle={() => this.handleButtonChange(-1)}
                    state={index === 0}
                  />
                  <a href={webTools.link}>
                    <Button title={"Link"} handle={() => {}} state={false} />
                  </a>
                  <Button
                    title={"Następne"}
                    handle={() => this.handleButtonChange(1)}
                    state={index === count - 1}
                  />
                </div>
              </>
            )
          );
        })}
      </div>
    );
  }
}

export default Narzedzia;
