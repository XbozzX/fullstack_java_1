import React from "react";
import Landing from "./landing.jsx";

export const Services = (props) => {

  if (!Landing) {
    return <div>Loading...</div>;  // Loading state
  }
  
  return (
    <div id="services" className="text-center">
      <div className="container">
        <div className="section-title">
          <h2>Our Services</h2>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit duis sed
            dapibus leonec.
          </p>
        </div>
        <div className="row">


           {/* //GET DATA FROM DB */}
           {/* original: props.data */}
          {Landing.backendProducts
              //props.data
            ? Landing.backendProducts.map((d, i) => (
                <div key={`${d.name}-${i}`} className="col-md-4">
                  {" "}
                  <i className={d.icon}></i>
                  <div className="service-desc">
                    <h3>{d.name}</h3>
                    <h4>{d.price}</h4>
                    <p>{d.text}</p>
                    <a href={`payment/${d.slug}`}>
                      <button
                        className="btn btn-custom"
                      >Buy Now
                      </button>
                    </a>
                  </div>
                </div>
              ))
            : "loading"}
        </div>
      </div>
    </div>
  );
};
