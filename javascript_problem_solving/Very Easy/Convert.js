// converting Minutes into Seconds
function convertMin(minutes){
    return minutes*60;
}
// console.log(convertMin(15));

// converting Seconds into Minutes
function convertSec(seconds){
     let output = seconds/60;

    return output.toFixed(2);
}
// console.log(convertSec(100));

// converting age in yrs into age in days
function convertAge (age){
    let leapyear = age/4;
    let total = age*365+leapyear;
    return total;
}
// console.log(convertAge(20));

// converting hours into seconds
function convertHour(...time){
  time.forEach(function(e){
     
  })
}
convertHour(1,1);


function check (...num){
    let result = 0;
num.forEach(function(e){
    result+= e
})
console.log(result)
}
check(5,3,4,5,6,);
