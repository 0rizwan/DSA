function matchStick(step){
    let minus = step-1;
    let result = (step*6)-minus;
    if (step == 0){
       result = 0;
    }
     return result;    
}
console.log(matchStick(2));