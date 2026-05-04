//Design a parking system where different types of vehicles (bike, car, truck) are assigned to appropriate slots automatically.

let slot = [];

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