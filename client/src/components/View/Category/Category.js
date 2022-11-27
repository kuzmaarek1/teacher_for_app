import React from "react";
import { NavLink } from "react-router-dom";
import UserService from "../../../services/UserService";
import Title from "../../Atoms/Title/Title.js";
import styles from "./Category.module.scss";

class Category extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      categories: [],
    };
    this.path();
  }

  componentDidMount() {
    this.path();
    this.openPage();
  }

  componentDidUpdate(prevProps) {
    if (this.props.match.path !== prevProps.match.path) {
      this.path();
      this.openPage();
    }
  }

  path() {
    this.pathId = this.props.match.params.id;
    this.pathMatch = this.props.match.path;
  }

  openPage() {
    const path = !this.pathId
      ? this.pathMatch === "/wyklady"
        ? UserService.getSubject()
        : UserService.getLanguage()
      : this.pathMatch === "/wyklady/kategoria/:id"
      ? UserService.getSliderCategory(this.pathId)
      : UserService.getCategoryByLanguage(this.pathId);
    path.then((response) => {
      this.setState({
        categories: response.data,
      });
    });
  }

  render() {
    const { categories } = this.state;
    const { wrapper, link } = styles;
    return (
      <div className={wrapper}>
        <Title index={null} description={"Wybierz kategorię"} />
        {categories.map(({ category }) => {
          const href = !this.pathId
            ? this.pathMatch === "/wyklady"
              ? `/wyklady/kategoria/${category}`
              : `/kody/kategoria/${category}`
            : this.pathMatch === "/wyklady/kategoria/:id"
            ? `/wyklady/zrodlowe/${category}`
            : `/kody/zrodlowe/${category}`;
          return (
            <NavLink key={href} to={href} className={link}>
              {category}
            </NavLink>
          );
        })}
      </div>
    );
  }
}

export default Category;
