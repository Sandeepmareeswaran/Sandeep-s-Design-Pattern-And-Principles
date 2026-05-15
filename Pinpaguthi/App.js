const express = require("express");
const cors=require("cors");
const app=express();
const studentRouter = require('./Routes/StudentRouter');
app.use(express.json());
app.use(cors());
app.use('/api/student/',studentRouter);

app.listen(5002,()=>{
    console.log("server runs on port 5002");
})
