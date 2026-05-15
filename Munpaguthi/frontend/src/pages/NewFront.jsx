import {useState,useEffect} from 'react';

import axios from 'axios';
function NewFront(){
    const [newback,setNewback] = useState([]);
    const [userName,setUserName] = useState("");
    const [age,setAge] = useState("");
    const [data,setData] = useState([]);
    
    useEffect(()=>{
        axios.get('http://localhost:4001/api/newback/lstpeople')
        .then((res)=>{
            setNewback(res.data);
        })
        .catch((error)=>{
            console.log(error);
        })
    },[])

    useEffect(()=>{
        axios.get("http://localhost:4001/api/newback/showdata")
        .then((res)=>{
            setData(res.data);
        })
        .catch(()=>{
            console.log("error");
        })
    },[])
    const handlesubmit = async(e)=>{
        e.preventDefault();
        try{
            const res = await axios.post("http://localhost:4001/api/newback/data",
            {
                userName,
                age
            }
        );
            setData([...data,res.data]);
            setUserName("");
            setAge("");
        
        }catch(error){
            console.log(error);
        }
    }
    return(
        <div className="main-container">
            <h1 className="hero-heading hero-heading-gradient">Enter the details that provided bellow</h1>
            <form className="card "
            onSubmit={handlesubmit}>
                <input
                className='input-card'
                type="text"
                placeholder="Enter your name"
                value = {userName}
                onChange={(e)=>setUserName(e.target.value)}
                />
                <input
                className='input-card'
                type="number"
                placeholder="Enter your age"
                value={age}
                onChange={(e)=>setAge(e.target.value)}
                />
                <button className="btn-primary" type='submit'>Upload details</button>
            </form>
            <div className="card">
                <h1 className="hero-subheading hero-subheading-gradient">user data</h1>
                {
                    data.map((item)=>(
                        <div key={item.id} className="lstcontent">
                            <h1>{item.userName}</h1>
                            <p>{item.age}</p>
                        </div>

                    ))
                }

            </div>
            
            <h1 className=" hero-subheading hero-subheading-gradient">hi all new backend connection</h1>
            {
                newback.map((item)=>(
                    <div key={item.id} className="grid grid-cols-2 rounded-3xl border border-white gap-5 gb-zinc-950 shadow-2xs p-3 w-full max-w-3xl shadow-white">
                        <h1 className="text-xs text-white">{item.userId}</h1>
                        <h2 className="text-sm text-gray-400 font-semibold">{item.title}</h2>
                    
                    </div>
                    

                ))
            }

        </div>
    );
}
export default NewFront;
