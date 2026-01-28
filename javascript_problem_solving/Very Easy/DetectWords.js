function detectWords (str){
   let arr = str.split("");
   let lowerCase = [];
   let UpperCase = [];
//    let string = "RIZWAN";
//    string.toLowerCase();
//    console.log(string)
   let result;
   arr.forEach((e) => {
       if (e == e.toLowerCase()){
        lowerCase.push(e);
       }
       else{
        UpperCase.push(e);
       }
   }); 
   result = lowerCase.join("");
   console.log(result);
   return result;
}
console.log(detectWords("AbCdasfa"));