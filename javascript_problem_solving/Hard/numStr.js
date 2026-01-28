function numInStr(arr) {
    let num = ['1', '2', '3', '4', '5', '6', '7', '9', '0']
    let finalArr = []
    arr.forEach((e) => {
        let charArr = e.split('')
        let final = charArr.forEach((char) => {
            let result = num.includes(char)
            if (result) {
                // console.log(charArr)
                return finalArr.push(charArr.join(''))
            }
        })
    })
    return finalArr
}
console.log(numInStr(['abc', 'ab10c',  'a10bc', 'bcd']))
