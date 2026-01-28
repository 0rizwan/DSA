function matchHouses (step){
    let deduction = step - 1;
    let sticks = 6;

    if(step == 0){
        return 0;
    }
    let result = step * sticks - deduction;
    return result;
}
console.log(matchHouses(3))