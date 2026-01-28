function minMax (arr){
    let newArr = [];
   arr.sort((a,b) => {
    return a-b;
   })
   newArr.push(arr[0]);
   newArr.push(arr[arr.length-1]);

//    arr.forEach((e,i)=>{
//     console.log('e= ',e,'i= ',i)
//     if (i == 0){
//         newArr.push(e);
//     }
//     else if (i == arr.length-1){
//         newArr.push(e);
//     }
// })
   return newArr;
}
console.log(minMax([12,5,1,2,3,7]));




// let array = [7,1,5,2,7,7,5,9];
// array.sort((a, b) => {
//     return a-b;
// })
// console.log(array);