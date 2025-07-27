import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {
  const average = props.total / props.goal;
  return (
    <div className="container">
      <h1>Score Calculator</h1>
      <p><strong>Name:</strong> {props.name}</p>
      <p><strong>School:</strong> {props.school}</p>
      <p><strong>Total:</strong> {props.total}</p>
      <p><strong>Goal:</strong> {props.goal}</p>
      <p><strong>Average:</strong> {average.toFixed(2)}</p>
    </div>
  );
}

export default CalculateScore;
