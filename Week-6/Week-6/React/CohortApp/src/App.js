import React from 'react';
import CohortDetails from './components/CohortDetails';

function App() {
  const cohort = {
    name: 'React Advanced Cohort',
    instructor: 'Shyam',
    status: 'ongoing'
  };

  return (
    <div className="container">
      <h1>Cohort Information</h1>
      <CohortDetails cohort={cohort} />
    </div>
  );
}

export default App;