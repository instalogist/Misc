import React from 'react';
import './App.css';
import HookCounterUseStateWithArray from './components/HookCounterUseStateWithArray';
// import HookCounterUseStateWithObject from './components/HookCounterUseStateWithObject';
// import HookCounterPreviousState from './components/HookCounterPreviousState';
// import ClassCounter from './components/ClassCounter';
// import HookCounter from './components/HookCounter';

function App() {
  return (
    <div className="App">
        {/* <ClassCounter/> */}
        {/* <HookCounter/> */}
        {/* <HookCounterPreviousState/> */}
        {/* <HookCounterUseStateWithObject/> */}
        <HookCounterUseStateWithArray/>
    </div>
  );
}

export default App;
