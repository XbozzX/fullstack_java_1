import React from "react";
import Landing from "./landing.jsx";
export const About = (props) => {

  if (!Landing) {
    return <div>Loading...</div>;  // Loading state
  }

  return (
    <div id="about">
      <div className="container">
        <div className="row">
          <div className="col-xs-12 col-md-6">
            {" "}
            <img src="img/about.jpg" className="img-responsive" alt="" />{" "}
          </div>
          <div className="col-xs-12 col-md-6">
            <div className="about-text">
              <h2>About Us</h2>
              {/* //GET DATA FROM DUMMY DATA*/}
              <p>{Landing.backTextData ? Landing.backTextData.paragraph : "loading..."}</p>
              <h3>Why Choose Us?</h3>
              <div className="list-style">
                <div className="col-lg-6 col-sm-6 col-xs-12">
                  <ul>
                    {/* //GET DATA FROM DUMMY DATA*/}
                    {/* original: props.data */}
                    {Landing.backTextData
                        // original: props.data.Why
                      ? Landing.backTextData.Why.map((d, i) => (
                          <li key={`${d}-${i}`}>{d}</li>
                        ))
                      : "loading"}
                  </ul>
                </div>
                <div className="col-lg-6 col-sm-6 col-xs-12">
                  <ul>
                    {/* original: props.data */}
                    {Landing.backTextData
                     // original: props.data.Why2
                      ? Landing.backTextData.Why2.map((d, i) => (
                          <li key={`${d}-${i}`}> {d}</li>
                        ))
                      : "loading"}
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};
