//Design a parking system where different types of vehicles (bike, car, truck) are assigned to appropriate slots automatically.

let slot = [];

class Vechicle{
    constructor(num,type){
        this.num=num;
        this.type=type;
        this.detail={
            Number:this.num,
            Type:this.type
        }

        
    }
    parkVechicle(){
        var f=false;
        for(let i=0;i<slot.length;i++){
            
            if(slot[i]["Type"]==this.type && slot[i]["Vehicle"]===null){
                slot[i]["Vehicle"]=this.detail;
                console.log("vehicle parked in the number called"+slot[i]["Number"]);
                f=true;
                break;
            }
        }
        if(!f){
            console.log("No space to park !!!");
        }
    }
    removePark(){
        
    }
}

function showAvail(Type){
    for(let i=0;i<slot.length;i++){
        if(slot[i]["Type"]==Type && slot[i]["Vehicle"]===null){
            console.log("Avail park "+slot[i]["Number"]);
        }
    }
}
function createSlots(n){
    for(let i=1;i<=n;i++){
        var slots={};
        slots["Number"]=i;
        if(i%3==0){
            slots["Type"]="Truck";
        }else if(i%2==0 && i!=6){
            slots["Type"]="Car";
        }else{
            slots["Type"]="Bike";
        }
        slots["Vehicle"]=null;
        slot.push(slots);
    }
    console.log(slot);
}
createSlots(10);

var b1=new Vechicle('TN 01 SM 20202','Bike');
b1.parkVechicle();
b1.removePark();
showAvail("Bike");
showAvail("Car");