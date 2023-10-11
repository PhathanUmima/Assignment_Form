let numarray = prompt("enter an array: ") 
let numArray=numarray.split(",")
let sortedArr = numArray.sort();//sort in asceding order
var temp;
var i=0;
var j=sortedArr.length-1; 
//sort in decending order
while(i<j){
    temp=sortedArr[i];
    sortedArr[i]=sortedArr[j];
    sortedArr[j]=temp;
    i=i+1;
    j=j-1;
} 
console.log(sortedArr);
