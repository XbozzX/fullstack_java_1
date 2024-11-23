import { Image } from "./image";
import React from "react";
import Landing from "./landing.jsx";

export const Gallery = () => {
  if(!Landing){
    return<div>Loading...</div>; //Loading state
  }

  return (
    <div id="portfolio" className="text-center">
      <div className="container">
        <div className="section-title">
          <h2>Gallery</h2>
          <p>
          "Browse our gallery to see our IT services"
          </p>
        </div>
        <div className="row">
          <div className="portfolio-items">
             {/* //GET DATA FROM DB */}
            {/* original: props.data */}
            {Landing.backGalaleryData
                //orignal: props.data
              ? Landing.backGalaleryData.map((d, i) => (
                  <div
                    key={`${d.title}-${i}`}
                    className="col-sm-6 col-md-4 col-lg-4"
                  >
                    <Image
                      title={d.title}
                      largeImage={d.largeImage}
                      smallImage={d.smallImage}
                    />
                  </div>
                ))
              : "404 not found"}
          </div>
        </div>
      </div>
    </div>
  );
};
