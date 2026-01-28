function tuckin (arr1, arr2){
    let arr3 = [];
    arr3.push(arr1[0]);
    arr2.forEach((e) => {
      arr3.push(e);
    })
    arr3.push(arr1[1]);
    return arr3;
}
console.log(tuckin(["aand", "dick"],["boobie", "chut"]));
