let n = 12321;
let ans = reverse(n, 0);

function reverse(n, a) {
    if (n == 0) {
        return a;
    }
    return reverse(Math.floor(n / 10), a * 10 + (n % 10))
}
if(n == ans) {
    console.log("It is a palindrome");
} else {
    console.log("It is not a palindrome");
}