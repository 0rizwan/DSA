function LessThan100 (a, b){
    let add = a + b;
    let result = true;
    if (add >= 100){
        result = false;
    }
    return result;
}
console.log(LessThan100(0,0));