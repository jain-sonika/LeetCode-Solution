/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    let map = {}

    for(let str of strs){
        let s = str.split('').sort().join('')
        if(!map[s]) map[s] = []
        map[s].push(str)
    }
    return Object.values(map)
};