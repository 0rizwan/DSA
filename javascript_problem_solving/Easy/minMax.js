"use strict"
function minMax(arr) {
    const sorting = arr.sort((a,b)=>a-b)
    const min = sorting[0]
    const max = sorting[sorting.length - 1]
    let result = [];
    result.push(min)
    result.push(max)
    return result
}
console.log(minMax([1]))
