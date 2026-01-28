function animals (chickens, cows, pigs){
    let breedOne = chickens*2;
    let breedTwo = cows*4;
    let breedThree = pigs*4;
    let result = breedOne + breedTwo + breedThree;
    return result;
}
console.log(animals(1,1,1));