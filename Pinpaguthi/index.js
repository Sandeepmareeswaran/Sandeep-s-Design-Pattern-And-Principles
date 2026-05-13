const  http = require("http");

const server = http.createServer((req,res)=>{
    res.end("hello world");
})

server.leistern(3000);