import React from "react";
// import Navbar from "./components/Navbar";
import homeImg from "../images/homeImg.jpeg";
// import Layout from "./layout";
import '../App.css';

const Home = () => {
  return (
    <div>
      {/* <Navbar /> */}
      <img
        className="HomeImg"
        src={homeImg}
        alt="plants and garden tools"
      ></img>
      <h2>
        Welcome to The Garden Project. Here is a place to design and track the
        garden of your dreams. Feel free to look around or jump right in to
        designing that perfect garden!
      </h2>
    </div>
  );
};
export default Home;
