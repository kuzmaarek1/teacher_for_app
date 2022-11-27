import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Header from "../Atoms/Header/Header.js";
import Login from "../View/Login/Login";
import QuizList from "../View/QuizTemplate/QuizList.js";
import Result from "../View/ResultTemplate/Result.js";
import Tools from "../View/ToolsTemplate/Tools.js";
import Category from "../View/Category/Category.js";
import Slider from "../View/Slider/Slider.js";
import MainPage from "../View/MainPage/MainPage.js";
const Root = () => {
  return (
      <BrowserRouter>
        <Header />
        <Login />
        <Routes>
          <Route exact path="/" element={<MainPage/>} />
          <Route path="/quiz" element={<QuizList/>} />
          <Route path="/answers" element={<Result/>} />
          <Route path="/narzedzia" element={<Tools/>} />
          <Route exact path="/kody" element={<Category/>} />
          <Route path="/kody/kategoria/:id" element={<Category/>} />
          <Route exact path="/wyklady" element={<Category/>} />
          <Route path="/wyklady/kategoria/:id" element={<Category/>} />
          <Route path="/kody/zrodlowe/:id" element={<Slider/>} />
          <Route path="/wyklady/zrodlowe/:id" element={<Slider/>} />
        </Routes>
      </BrowserRouter>
  );
};

export default Root;
