let arr = [2, 4, 6, 1, 3];
let target = 3;
function search(arr, target, index) {
    if (index >= arr.length) {
        return -1;
    }
    if(arr[index] == target) {
        return index;
    }
    return search(arr, target, index + 1);
}
let ans = search(arr, target, 0);
console.log(ans)