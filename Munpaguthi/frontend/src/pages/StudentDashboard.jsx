import {useEffect,useState} from 'react';
import axios from "axios";
function StudentDashboard(){
    const[student,setStudent] = useState([]);
    const[studentName,setStudentName]=useState("");
    const[course,setCourse]=useState("");
    const[duration,setDuration] = useState("");
    const[studentDetails,setStudentDetails]=useState([]);
    const[task,setTask]=useState([]);
    
    useEffect(()=>{
        axios.get("http://localhost:5001/api/student")
        .then((item)=>{
            setStudent(item.data);
        })
        .catch((error)=>{
            console.log(error);
        })
    },[])

    useEffect(()=>{
        axios.get("http://localhost:5001/api/student/local")
        .then((item)=>{
            setStudentDetails(item.data);
        })
        .catch((error)=>{
            console.log(error);
        })
    },[])

    const showTask=async(id)=>{
        try{
            const res = await axios.get(`http://localhost:5001/api/student/${id}/task`);
            setTask(res.data);
        }catch(error){
            console.log(error);
        }
    }

    

    const handleSubmit= async(e)=>{
        e.preventDefault();
        try{
            const res = await axios.post("http://localhost:5001/api/student/add",
            {
                studentName,
                course,
                duration
            }
        );
            setStudentDetails([...studentDetails,res.data]);
            setStudentName("");
            setCourse("");
            setDuration("");
        }catch(error){
            console.log(error);
        }
    }
    return(
        <div className="main-container">

            <form 
            onSubmit={handleSubmit} className="flex flex-col gap-3 card">
                <input className="input-card"
                type="text"
                placeholder="Enter the student name"
                value={studentName}
                onChange={(e)=>setStudentName(e.target.value)}/>

                <input className="input-card"
                type="text"
                placeholder="Enter the course name"
                value={course}
                onChange={(e)=>setCourse(e.target.value)}/>

                <input className="input-card"
                type="number"
                placeholder="Ente the duration"
                value={duration}
                onChange={(e)=>setDuration(e.target.value)}/>

                <button className="btn-primary" type="submit">Submit Data</button>

            </form>
            <h1 className="hero-heading hero-heading-gradient"> local student details</h1>
            {
                studentDetails.map((item)=>(
                    <div key={item.id} className="card text-gray-500">
                        <h1 className="font-bold text-white">{item.studentName}</h1>
                        <p>{item.course}</p>
                        <p>{item.duration}</p>
                    </div>
                ))
            }
            
            <h1 className="hero-heading hero-heading-gradient">Student Details</h1>
            <div className="grid card grid-cols-3 p-3 text-gray-500">
            {
                student.map((item)=>(
                    <div key={item.id} onClick={()=>showTask(item.id)} >
                        <h1>{item.name}</h1>
                        <p>{item.email}</p>
                        <p>{item.company_name}</p>
                    </div>
                ))
            }
            </div>
            <h1 className="hero-subheading hero-subheading-gradient ">Display task</h1>
            {
                task.map((item)=>(
                    <div key={item.id} className="card text-gray-500">
                        <h1>{item.title}</h1>
                    
                        <p>
                            {item.completed ? "Completed" : "Pending"}
                        </p>
                    </div>

                ))
            }

        </div>

    )
}

export default StudentDashboard;