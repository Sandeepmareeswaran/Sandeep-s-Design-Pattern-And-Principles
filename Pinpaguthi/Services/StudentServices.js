const axios = require("axios"); 
const student=[];
const getStudent = async(req,res)=>{
    try{
        const resource  = await axios.get("https://jsonplaceholder.typicode.com/users");
        const result = resource.data.map((item)=>{
            return{
                id:item.id,
                name:item.name,
                email:item.email
            }
        });
        res.json(result);
    }
    catch{
        res.status(500).json("url not found");
    }
}

const getTask = async(req,res)=>{
    const id = req.params.id;
    try{
        const response = await axios.get("https://jsonplaceholder.typicode.com/todos");
        const result = response.data.filter((item)=>item.userId==id);
        res.json(result);
    }catch{
        res.status(500).json("Invalid url");
    }
}

const addStudent=async(req,res)=>{
    const{studentName,course,duration}=req.body;
    if(!studentName || !course || !duration){
        res.status(400).json({
            error:"enter all the valid fields"
        })
    }
    const newStudent={
        id:student.length+1,
        studentName,
        course,
        duration
    }
    student.push(newStudent);
    res.status(201).json(newStudent);
}

const local=async(req,res)=>{
    res.json(student);
}
module.exports={
    getStudent,
    getTask,
    addStudent,
    local
};