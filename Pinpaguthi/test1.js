const express  = require("express");
const axios = require("axios");
const cors =  require("cors");
const app = express();
app.use(cors());
app.use(express.json());
let appointment=[];
app.get('/api/doctors/1/appointments', async(req,res)=>{
    try{
        const response= await axios.get("https://jsonplaceholder.typicode.com/posts");

        const doc = response.data.filter((item)=>item.userId==1);
        res.json(doc);

    }catch(error){
        res.status(500).json({
            error:"error"
        });
    }
});

app.get('/api/doctors/2/title',async(req,res)=>{
    try{
        const response = await axios.get("https://jsonplaceholder.typicode.com/posts");
        const doc = response.data.filter((item)=>item.title=="nesciunt quas odio");
        console.log(doc);
    }catch(error){
        res.status(500).json({
            error:"error in fetching"
        });
    }
})


app.post('/api/appointments',async(req,res)=>{
    const{ doctorId,title,discription} = req.body;
    if(!doctorId || !title || !discription){
        return res.status(400).json({
            error:"required all the valid"
        })
    }
    const newApp={
        id:appointment.length+1,
        doctorId,
        title,
        discription
    }

    appointment.push(newApp);
    res.status(201).json(newApp);
    
   

})
const patient=[];
app.post("/api/patients",async(req,res)=>{
    const{patientId,age,des} = req.body;
    if(!patientId || !age || !des){
        return res.status(400).json({
            error:"Fill all the required details"
        })
    }
    const newpat = {
        id:patient.length + 1,
        patientId,
        age,
        des
    }
    patient.push(newpat);
    res.status(201).json(newpat);
})
let booking=[];

app.post("/api/bookapp",async(req,res)=>{
    const{patientName,age,des} = req.body;

    if(!patientName || !age || !des){
        return res.status(400).json({
            error:"Fill all the details"
        })
    }
    const newbook = {
        id:booking.length +1,
        patientName,
        age,
        des
    }
    booking.push(newbook);
    res.status(201).json(newbook);

})

app.get("/api/showbook",async(req,res)=>{
    return res.status(200).json(booking);
})


app.listen(4000,()=>{
    console.log("server listerning on the port 4000");
})