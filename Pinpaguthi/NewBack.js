const express = require("express");
const axios = require("axios");
const cors = require("cors");
const app = express();
app.use(cors());
app.use(express.json());

app.get('/api/newback/lstpeople', async(req,res)=>{
    
    try{
        const response = await axios.get("https://jsonplaceholder.typicode.com/posts");
        const result = response.data.map((item)=>{
            return{
                userId:item.userId,
                id:item.id,
                title:item.title

            };
           
        });
        res.json(result);
    }catch{
        res.status(500).json({
            error:"not found"
        })
    }
});
const data=[];
app.post('/api/newback/data',async(req,res)=>{
    const {userName,age} = req.body;
    if(!userName || !age){
        res.status(400).json({
            error:'fill all the req'
        })
    }
    const newdata = {
        id:data.length+1,
        userName,
        age
    }
    data.push(newdata);
    res.status(201).json(newdata)
})

app.get('/api/newback/showdata', async(req,res)=>{
    return res.json(data);
})
app.listen(4001,()=>{
    console.log("running on port 4001")
})