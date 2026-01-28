function num_of_digits(num) {
    let str = num.toString()
	let numArr = str.split("");
    let result = []
    numArr.forEach((e)=>{
        if(e!=='-' ){
            result.push(e)
        }
    })
    console.log(result, str)
    return result.length
}
console.log(num_of_digits(-12381428))
