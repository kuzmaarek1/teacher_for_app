import React from "react";
import UserService from "../../../services/UserService";
import Title from "../../Atoms/Title/Title.js";
import Button from "../../Atoms/Button/Button.js";
import styles from "./Slider.module.scss";

class Slider extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      slider: [],
      count: 0,
      category: [],
    };
  }

  componentDidMount() {
    const pathId = this.props.match.params.id;
    const pathMatch = this.props.match.path;

    const services =
      pathMatch === "/wyklady/zrodlowe/:id"
        ? UserService.getSlider(pathId)
        : UserService.getCode(pathId);

    services.then((response) => {
      this.setState({
        slider: response.data,
      });
    });
  }

  handleButtonChange = (number) => {
    this.setState({
      count: this.state.count + number,
    });
  };

  render() {
    const countSlider = this.state.slider.length;
    return (
      <div className={styles.codeWrapper}>
        {this.state.slider.map(
          ({ code, file, slider }, index) =>
            this.state.count === index && (
              <>
                <Title index={index} description={this.props.match.params.id} />
                {this.props.match.path === "/wyklady/zrodlowe/:id" ? (
                  <div className={styles.image}>
                    <img  className={styles.img} src={"data:image/png;base64, " + slider} alt="" />
                  </div>
                ) : (
                  <>
                    <div className={styles.file}>{file}</div>
                    <div className={styles.code}>
                      <pre>{code}</pre>
                    </div>
                  </>
                )}
                <div className={styles.buttonsGrid}>
                  <Button
                    title={"Wcześniejsze"}
                    handle={() => this.handleButtonChange(-1)}
                    state={index === 0}
                  />
                  <Button
                    title={"Następne"}
                    handle={() => this.handleButtonChange(1)}
                    state={index === countSlider - 1}
                  />
                </div>
              </>
            )
        )}
      </div>
    );
  }
}
export default Slider;
