var s = prompt("Enter a string:"); 

var k = s.split(" ");
var m = 0;
var ans = "";

for (var i = 0; i < k.length; i++) {
    var l = k[i];
    var c = l.length;

    for (var r = c - 1; r >= 0; r--) {
        ans += l[r];
    }

    ans += " ";
}

document.write("Reversed String:" );
document.write(ans.slice(0, ans.length - 1));
 
