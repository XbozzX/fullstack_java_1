import React from "react";
import Landing from "./landing.jsx";


export const Features = () => {

  if (!Landing) {
    return <div>Loading...</div>;  // Loading state
  }

  return (
    <div id="features" className="text-center">
      <div className="container">
        <div className="col-md-10 col-md-offset-1 section-title">
          <h2>Features</h2>
        </div>
        <div className="row">
          {/* //GET DATA FROM DB */}
          {/* original: props.data */}
          {Landing.backTextData
              // original: props.data
            ? Landing.backTextData.map((d, i) => (
                <div key={`${d.title}-${i}`} className="col-xs-6 col-md-3">
                  {" "}
                  <i className={d.icon}></i>
                  <h3>{d.title}</h3>
                  <p>{d.text}</p>
                </div>
              ))
            : "404 not found..."}
        </div>  
      </div>
    </div>
  );
};
