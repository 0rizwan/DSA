function trackRobot(...steps) {
	let x = 0;
    let y = 0;
    let direction = "north";
    
    steps.forEach((e,i)=>{
        console.log(e)
        if(direction == "north"){
            y += e
            direction = "east"
        }else if(direction == "east"){
            x += e
            direction = "south"
        }else if(direction == "south"){
            y -= e
            direction = "west"
        }else if(direction == "west"){
            x -= e
            direction = "north"
        }
    })
    return [x, y]; 
}
console.log(trackRobot(10,25,12,14,13,42))