import React,  { useEffect, useState } from "react";
import axios from 'axios';

axios.defaults.withCredentials = true;

const API_BASE_URL = 'http://localhost:8082';

export const Team = () => {
  const token = localStorage.getItem('jwtToken');
  const username = localStorage.getItem('userName');
  const [Users, setUsers] = useState([]);

  useEffect(() => {
    // Fetch all products from the API
    fetch( `${API_BASE_URL}/api/users`,

      {
        // request headers
        headers: {
          'Content-Type': 'application/json',
          Authorization: `Bearer ${token}`,
        }
      }) // Your backend API URL
      .then(response => response.json())
      .then(data => {
        setUsers(data);
      })
      .catch(error => console.error('Error fetching user:', error));
  }, []);

  /////////////////////////

  if (!Users) {
    return <div>Loading...</div>;  // Loading state
  }

  return (
    <div id="team" className="text-center">
      <div className="container">
        <div className="col-md-8 col-md-offset-2 section-title">
          <h2>Meet the Team</h2>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit duis sed
            dapibus leonec.
          </p>
        </div>
        <div id="row">
           {/* //GET DATA FROM DB */}
          {/* //original: props.data */}
          {Users.length > 0
              //original: props.data
            ? Users.map((Users, index) => (
                <div key={`${Users.name}-${index}`} className="col-md-3 col-sm-6 team">
                  <div className="thumbnail">
                    {" "}
                    <img src={Users.img} alt="..." className="team-img" />
                    <div className="caption">
                      <h4>{Users.name}</h4>
                      <p>{Users.job}</p>
                    </div>
                  </div>
                </div>
              ))
            : "loading"}
        </div>
      </div>
    </div>
  );
};
