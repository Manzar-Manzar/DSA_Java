let n = 109203
let zeroes = count(n, 0);
console.log(zeroes)
function count(n, a) {
    if (n == 0) {
        return a
    }
    if (n % 10 == 0) {
        return count(Math.floor(n / 10), a + 1);
    } else {
        return count(Math.floor(n / 10), a);
    }
}