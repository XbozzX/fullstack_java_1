import React , { useEffect, useState }from "react";


import axios from 'axios';

axios.defaults.withCredentials = true;

const API_BASE_URL = 'http://localhost:8082';

export const Features = () => {
  const token = localStorage.getItem('jwtToken');
  const username = localStorage.getItem('userName');
  const [WebsiteTexts, setTitle] = useState([]);


  useEffect(() => {
    // Fetch all text from the API
    fetch( `${API_BASE_URL}/api/website-texts`,

      {
        // request headers
        headers: {
          'Content-Type': 'application/json',
          Authorization: `Bearer ${token}`,
        }
      })
      .then(response => response.json())
      .then(data => {
        setTitle(data);
      })
      .catch(error => console.error('Error fetching website texts:', error));
  }, []);

  if (!WebsiteTexts) {
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
          {WebsiteTexts.length > 0
              //props.data
            ? WebsiteTexts.map((WebsiteTexts, index) => (
                <div key={`${WebsiteTexts.name}-${index}`} className="col-md-4">
                  {" "}

                  
                    <h3>{WebsiteTexts.title}</h3>
                    <p>{WebsiteTexts.postShortDescription}</p>
                   
                  {/*<div className="features-desc">*/}
                  {/* Display Image */}
                  {/* {product.imageStore && (
                    <img
                      src={`data:image/jpeg;base64,${product.imageStore}`} // Displaying image
                      alt={product.title}
                      className="img-fluid"
                      style={{ width: '150px', height: '150px' }}
                    />
                  )}
                  <h3>{product.title}</h3>
                  <h4>{product.tag}</h4>
                  <p>{product.postShortDescription}</p>
                  <p>{product.place}</p>
                  <p>{product.dateProduct}</p>
                  <p>{product.status}</p> */}
                  {/* Add any other fields you need */}
                </div>
                

              ))
            : "loading"}
        </div>
      </div>
    </div>
  );
};