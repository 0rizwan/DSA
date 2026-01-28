function countBoomerangs(arr) {
    let result = 0;
    arr.forEach((e, i) => {
        if (i < arr.length - 2) {
            if (arr[i] === arr[i + 2] && arr[i + 1] !== arr[i]) {
                result++;
            }
            console.log(arr[i], arr[i + 1], arr[i + 2])
        }
    })
    return result;
}

console.log(countBoomerangs([1,2,1]))