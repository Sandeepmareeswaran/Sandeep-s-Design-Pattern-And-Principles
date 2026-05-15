const express = require("express");
const axios = require("axios");
const cors = require("cors");
const app = express();
app.use(cors());
app.use(express.json());

app.get("/api/student", async(req,res)=>{
    try{
        const response = await axios.get("https://jsonplaceholder.typicode.com/users");
        const result = response.data.map((item)=>{
            return{
                id:item.id,
                name:item.name,
                email:item.email,
                company_name:item["company"]["name"]
            };
        })
        res.json(result);
    }catch{
        res.status(500),json({
            error:"not found error"
        })
    }
})

app.get("/api/student/:id/task", async(req,res)=>{
    const id = req.params.id;
    try{
        const response  = await axios.get("https://jsonplaceholder.typicode.com/todos");
        const result = response.data.filter((item)=>item.id==id)
        res.json(result);

    }catch{
        res.status(500).json({
            error:"Not found id"
        })
    }

})
const student=[];
app.post("/api/student/add", async(req,res)=>{
    const{studentName,course,duration} = req.body;
    if(!studentName || !course || !duration){
        res.status(400).json({
            error:"Need to fuill all the data"
        })
    }
    const newStudent ={
        id:student.length+1,
        studentName,
        course,
        duration
    }
    student.push(newStudent);
    res.status(201).json(newStudent);
})

app.get("/api/student/local",async(req,res)=>{
    return res.json(student);
})

app.listen(5001,()=>{
    console.log("Server listening at the port 5001");
})