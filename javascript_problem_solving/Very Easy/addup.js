function addUp (num){
    let addup = 0;
    for (i=0; i <= num; i++){
        addup = addup + i;
    }
    return addup;
}
console.log(addUp(5));