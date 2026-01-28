function whichIslarger (f, g){
   if (f() > g()){
    return "f";
   }
   else if (g() > f()){
    return "g";
   }
   else{
    return "neither";
   }
}
console.log(whichIslarger(() => 50, () => 10));
