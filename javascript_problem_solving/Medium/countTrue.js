function countTrue(arr) {
    let trueCount = [];
    arr.forEach((e) => {
        if (e == true) {
            trueCount.push(e)
        }
    })
    return trueCount.length;
}
console.log(countTrue([true, false, true]))