function oddishOrEvenish(num) {
    let str = num.toString()
    let arr = str.split("");

    let result = 0;
    arr.forEach((e) => {
        result += parseInt(e)
    })
    if (result % 2 == 0){
        return "Evenish"
    }else{
        return "Oddish"
    }
}
console.log(oddishOrEvenish(113))




