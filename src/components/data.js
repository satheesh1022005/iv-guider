import 'bootstrap/dist/css/bootstrap.min.css';
import React, { useState, useEffect } from 'react';
import Step from './Step'
const Data = () => {
  const [data, setData] = useState(null);
  const apiUrl = 'http://localhost:8080/api/steps'; 
  useEffect(() => {
    fetch(apiUrl)
      .then((res) => res.json())
      .then((json) => setData(json));
  }, []);
  if (!data) {
    return <p>Loading...</p>;
  }

  return (
    <div>
      {data.map((step) => (
        <Step key={step.step} step={step} />
      ))}
    </div>
  );
};

export default Data;
