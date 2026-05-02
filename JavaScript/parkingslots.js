//Manage parking slots for vehicles.
var slots = [];
var vlist = [];
class Vehicle{
    
    constructor(name,type){
        this.number=name;
        this.type=type;
        this.veh={
            VehicleName:this.number,
            Type:this.type
        }
        vlist.push(this.veh);
        console.log(vlist);
    }

    bookSlot(number){
        var bkslot = slots[number-1];
        console.log(bkslot);
        if(bkslot["Vehicles"]===null){
            slots[number]["Vehicles"]=this.veh;
            console.log(slots);
        }else{
            console.log("this slot already bookek !!");
        }    
    }

    removeSlot(){
        for(let i=0;i<slots.length;i++){
            let tem = slots[i];
            if(tem["Vehicles"]===this.veh){
                slots[i]["Vehicles"]=null;
            }
        }
    }
}

function createSlots(n){
    for(let i=1;i<=n;i++){
        slots.push({Number:i,Vehicles:null});
    }
    console.log("Slots created !!");
    
}

function seeAvailSlots(){
    for(let i=0;i<slots.length;i++){
        var temp = slots[i];
        if(temp["Vehicles"]===null){
            console.log("Slots numbers: "+temp["Number"]);
        }
      

    }
}
createSlots(10);



let v1 = new Vehicle("TN 15 MS 2422","4wheel");
v1.bookSlot(2);
seeAvailSlots();
