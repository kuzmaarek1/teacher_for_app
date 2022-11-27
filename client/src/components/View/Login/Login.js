import React, { Component } from "react";
import axios from "axios";
//import { Formik } from "formik";

class Login extends Component {
  handleDashboard = () => {
    axios.get("http://localhost:8080/dashboard").then((res) => {
      if (res.data === "success") {
        this.props.history.push("/dashboard");
      } else {
        alert("Authentication failure");
      }
    });
  };

  render() {
    return (
      /*
      <Formik
        initialValues={{ userName: "", password: "" }}
        onSubmit={(values) => {
          /*axios
            .post("http://localhost:8080/login", values)
            .then((res) => {
              localStorage.setItem("authorization", res.data.token);
              return this.handleDashboard();
            });
            console.log(values);
        }}
      >
        {({ values, handleChange, handleSubmit }) => (
          <form onSubmit={handleSubmit}>
            <label forHtml="userName">Username:</label>
            <input
              onChange={handleChange}
              name="userName"
              value={values.userName}
            />
            <label forHtml="password">Password:</label>
            <input
              onChange={handleChange}
              name="password"
              value={values.password}
            />
            <button type="submit">Submit</button>
          </form>
        )}
      </Formik>*/ <></>
    );
  }
}

export default Login;
