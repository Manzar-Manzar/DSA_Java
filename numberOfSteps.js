// 1342. Number of Steps to Reduce a Number to Zero

// Given an integer num, return the number of steps to reduce it to zero.

// In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

let n = 1232
let steps = count(n, 0)
function count(n, a) {
    if(n == 0) {
        return a
    }
    if(n % 2 == 0) {
        return count(n / 2, a + 1)
    } else {
        return count(n - 1, a + 1)
    }
}
console.log(steps)