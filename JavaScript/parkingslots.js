//Manage parking slots for vehicles.
var slots = [];

function createSlots(n){
    for(let i=1;i<=n;i++){
        slots.push({Number:i,Vehicles:null});
    }
    console.log("Slots created !!");
    
}

function seeAvailSlots(){
    for(let i=0;i<slots.length;i++){
        var temp = slots[i];
        if(temp["Vehicles"]==null){
            console.log("Slots numbers: "+temp["Number"]);
        }
      

    }
}
createSlots(10);
console.log(slots[1]);
seeAvailSlots();