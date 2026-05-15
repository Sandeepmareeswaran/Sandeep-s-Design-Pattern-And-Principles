const express = require("express");
const router= express.Router();
const{
    getStudent,getTask,addStudent,
    local
} = require('../Services/StudentServices');

router.get('/',getStudent);
router.get('/:id/task',getTask);
router.post('/addStudent',addStudent)
router.get('/local',local)
module.exports=router;
