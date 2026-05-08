console.log('5'+2);
console.log('5'-2);

console.log('5'*2);

console.log('5'/2);
console.log([1]===[1]);console.log([]==[]);
console.log(Boolean([]));
console.log([1,2]+[2,3]);

s=['h','e','l','l','o'];
    for(let i=0;i<s.length/2;i++){
        var temp = s[i];
        s[i]=s[s.length-1-i];
        s[s.length-1-i]=temp;
    }
console.log(s);

var si=[1,2,3];
console.log(Math.max(Number(si)));