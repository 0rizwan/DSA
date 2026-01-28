function sevenBoom(arr) {
    let str = arr.join("").split("")
    let found;
    let result = "";
    str.forEach(e => {
        if (parseInt(e) === 7) {
            found = true
        }
    })
    found ? result = "Boom!" : result = "there is no 7 in the array"
    return result;
}


console.log(sevenBoom([1,2,4]))