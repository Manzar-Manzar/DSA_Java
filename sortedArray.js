let arr = [2, 4, 1, 6, 7];
let ans = usingRecursion(arr, 0);
function usingRecursion(arr, start) {
    if(start == arr.length) {
        return true;
    }
    if(arr[start] > arr[start + 1]) {
        return false;
    }
    return usingRecursion(arr, start + 1);
}
console.log(ans)