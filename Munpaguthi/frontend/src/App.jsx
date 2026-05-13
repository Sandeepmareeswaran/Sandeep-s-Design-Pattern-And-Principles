import {useEffect,useState} from 'react';
import axios from 'axios';

function App(){
  const[bookings,setBookings]=useState([]);
  useEffect(()=>{
    axios.get("http://localhost:4000/api/showbook")
    .then((res)=>{
      setBookings(res.data);
    })
    .catch((error)=>{
      console.log(error);
    })
  })
  return(
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

  );
}
export default App;
