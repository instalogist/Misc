import React,{useState} from 'react'

function HookCounterPreviousState() {
    const initalcount = 0
    const [count, setCount] = useState(initalcount)
    
    const incrementFive = () =>{
        for(let i = 0; i<5 ;i++){
            setCount(prevCount => prevCount + 1)
        }
    }

    return (
        <div>
            Count : {count}
            <button onClick={()=> setCount(prevCount => prevCount+1)}>Increment</button>
            <button onClick={()=> setCount(prevCount => prevCount-1)}>Decrement</button>
            <button  onClick={()=> setCount(initalcount)}>Reset</button>
            <button  onClick={incrementFive}>Inc By 5</button>
        </div>

)
}

export default HookCounterPreviousState
