let n = 12345;
let ans = helper(n, 0);

function helper(n, a) {
    if (n == 0) {
        return a;
    }
    return helper(Math.floor(n / 10), a + n % 10);
}

console.log(ans);
