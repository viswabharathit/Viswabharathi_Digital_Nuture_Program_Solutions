import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore name="Pavi" school="SVS School" total={480} goal={2} />
    </div>
  );
}

export default App;
