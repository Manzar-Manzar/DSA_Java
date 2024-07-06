let n = 12345;
let ans = reverse(n, 0);
function reverse(n, a) {
    if (n == 0) {
        return a;
    }
    return reverse(Math.floor(n / 10), a * 10 + (n % 10))
}
console.log(ans)