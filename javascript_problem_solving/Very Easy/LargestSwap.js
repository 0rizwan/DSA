function largestSwap(num){
   let swap = true;
   let str = String(num);
   let arr = str.split("");
   let firstDigit = arr[0];
   let secondDigit = arr[1];
//    console.log(secondDigit);

    if (firstDigit > secondDigit){
        return swap;
    }
    else if (firstDigit == secondDigit){
        return swap;
    }
    else{
        return false;
    }
}
console.log(largestSwap(63));

