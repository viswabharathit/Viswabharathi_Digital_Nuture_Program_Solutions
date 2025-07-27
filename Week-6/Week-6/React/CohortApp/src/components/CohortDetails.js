import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails({ cohort }) {
  const { name, instructor, status } = cohort;

  const statusStyle = {
    color: status === 'ongoing' ? 'green' : 'blue'
  };

  return (
    <div className={styles.box}>
      <dl>
        <dt>Cohort Name:</dt>
        <dd>{name}</dd>
        <dt>Instructor:</dt>
        <dd>{instructor}</dd>
      </dl>
      <h3 style={statusStyle}>Status: {status}</h3>
    </div>
  );
}

export default CohortDetails;