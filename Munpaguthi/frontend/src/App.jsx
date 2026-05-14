import {useEffect,useState} from 'react';
import axios from 'axios';

function App(){
  const[patientName,setpatientName] = useState("");
  const[age,setAge]=useState("");
  const[des,setDes]=useState(""); 
  const[bookings,setBookings]=useState([]);
  useEffect(()=>{
    axios.get("http://localhost:4000/api/showbook")
    .then((res)=>{
      setBookings(res.data);
    })
    .catch((error)=>{
      console.log(error);
    })
  },[])
  

  const handleSubmit= async (e)=>{
    e.preventDefault();
    try{
      const res =await axios.post(
        'http://localhost:4000/api/bookapp',
        {
          patientName,
          age,
          des
        }
      );
      setBookings([...bookings,res.data]);
      setpatientName("");
      setAge("");
      setDes("");

    }catch(error){
      console.log(error);
    }
  }

  
  return(
    <div>
      <form
      onSubmit={handleSubmit}>
        <input
        value={patientName}
        placeholder="Enter the patient name"
        onChange={(e)=>setpatientName(e.target.value)}
        />
        <input
        value={age}
        placeholder="Enter the age"
        onChange={(e)=>setAge(e.target.value)}
        />
        <input
        value={des}
        placeholder="Enter the des"
        onChange={(e)=>setDes(e.target.value)}
        />
        <button type='submit'>Submit</button>


      </form>
    <div>

    </div>
    <div>
      <h1>Bookings Appointments are listed bellow!!</h1>
      {
        bookings.map((item)=>(
          <div id={item.id}>
            <h2>{item.patientName}</h2>
            <p>{item.age}</p>
          </div>
        ))
      }
    </div>
    </div>

  );
}
export default App;
