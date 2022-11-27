import React from "react";
import UserService from "../../../services/UserService";
import Title from "../../Atoms/Title/Title.js";
import Answer from "../../Atoms/Answer/Answer.js";
import Button from "../../Atoms/Button/Button.js";
import styles from "./QuizList.module.scss";

class QuizList extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      quiz: [],
      namberQuestion: 0,
      arrayAnswers: [],
    };
  }

  componentDidMount() {
    UserService.getUsers().then((response) => {
      this.setState({
        quiz: response.data,
      });
      this.setState({
        arrayAnswers: new Array(this.state.quiz.length).fill(" "),
      });
    });
  }

  handleButtonChange = (number) => {
    this.setState({
      namberQuestion: this.state.namberQuestion + number,
    });
  };

  handleAnswer = (e, id) => {
    const clicked = e.target.id;
    this.setState((state) => {
      const arrayAnswers = state.arrayAnswers.map((item, index) => {
        if (id === index) {
          if (item === clicked) return "";
          else return clicked;
        } else {
          return item;
        }
      });

      return {
        arrayAnswers,
      };
    });
  };

  handleButtonSend =()=> {
    UserService.sendAnswer(this.state.arrayAnswers).then((response) => {
      this.props.history.push({
        pathname: "/answers",
        state: { result: response.data },  
        maxResult:this.state.quiz.length,
      });
    });
  }

  render() {
    const { quiz, namberQuestion, arrayAnswers } = this.state;
    const { wrapper, answers, questions, buttonsGrid } = styles;
    const arraySubpoint = ["A", "B", "C", "D"];
    return (
      <div className={wrapper}>
        <div className={questions}>
          {quiz.map((quiz, index) => {
            return (
              index === namberQuestion && (
                <>
                  <Title index={index} description={quiz.question} />
                  {quiz.image && (
                    <img src={"data:image/png;base64, " + quiz.image} className={styles.img} alt="" />
                  )}
                  <div className={answers}>
                    {arraySubpoint.map((letter) => (
                      <Answer
                        index={index}
                        letter={letter}
                        answer={eval("quiz.answer" + letter)}
                        handle={(event) => this.handleAnswer(event, index)}
                        state={arrayAnswers}
                      />
                    ))}
                  </div>
                </>
              )
            );
          })}
          <div className={buttonsGrid}>
            <Button
              title={"Wcześniejsze"}
              handle={() => this.handleButtonChange(-1)}
              state={namberQuestion === 0}
            />
            <Button
              title={"Sprawdź"}
              handle={() => this.handleButtonSend()}
              state={namberQuestion < quiz.length - 1}
            />
            <Button
              title={"Następne"}
              handle={() => this.handleButtonChange(1)}
              state={namberQuestion === quiz.length - 1}
            />
          </div>
        </div>
      </div>
    );
  }
}

export default QuizList;
