import axios from "axios";

const QUIZ_REST_API_URL = "http://localhost:8080/quiz/questions";
const QUIZ_REST_API_URL_ANSWER = "http://localhost:8080/quiz/result";
const WEB_TOOLS_REST_API_URL = "http://localhost:8080/web/tools";
const LANGUAGE_REST_API_URL = "http://localhost:8080/language/category";
const LANGUAGE_CATEGORY_REST_API_URL = "http://localhost:8080/codeTitle/";
const CODE_REST_API_URL = "http://localhost:8080/code/";
const SUBJECT_REST_API_URL = "http://localhost:8080/subject/name";
const TITLE_SLIDER_REST_API_URL = "http://localhost:8080/title/";
const SLIDER_REST_API_URL = "http://localhost:8080/slider/";

class UserService {
  getUsers() {
    return axios.get(QUIZ_REST_API_URL);
  }
  sendAnswer(answer) {
    return axios.post(QUIZ_REST_API_URL_ANSWER, answer);
  }
  getWebTools() {
    return axios.get(WEB_TOOLS_REST_API_URL);
  }
  getLanguage() {
    return axios.get(LANGUAGE_REST_API_URL);
  }
  getCategoryByLanguage(language) {
    return axios.get(`${LANGUAGE_CATEGORY_REST_API_URL}${language}`);
  }
  getSliderCategory(subject) {
    return axios.get(`${TITLE_SLIDER_REST_API_URL}${subject}`);
  }
  getSubject() {
    return axios.get(SUBJECT_REST_API_URL);
  }
  getCode(category) {
    return axios.get(`${CODE_REST_API_URL}${category}`);
  }
  getSlider(category) {
    return axios.get(`${SLIDER_REST_API_URL}${category}`);
  }
}

export default new UserService();
