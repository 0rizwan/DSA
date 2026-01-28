function seriesResistance (arr){
    let sumArr = 0;
    arr.forEach(element => { 
        sumArr += element;
    });
    return sumArr;
}
console.log(seriesResistance([10,2,3,4]));
