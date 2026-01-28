function toArray(obj) {
    const resultArr = []
    for (let key in obj) {
        console.log(key, obj[key])
        let array = []
        array.push(key)
        array.push(obj[key])
        console.log(array)
        resultArr.push(array)
    }
    return resultArr;
    
}
console.log(toArray({a:1, b:2}))

// let result = 'name'
// let obj={
//     name:'Ehtesham',
//     age:19
// }
// console.log(obj[result])//obj.name
