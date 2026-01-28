function MilkAndCookies (date){
let month = date.getMonth();
let tarikh = date.getDate();
let result;
console.log(month, tarikh)
if(date.getMonth()==month&& date.getDate()==tarikh){
return result=true
}else{
    return false
}
return result
}
console.log(MilkAndCookies(new Date(2013, 11, 24)));