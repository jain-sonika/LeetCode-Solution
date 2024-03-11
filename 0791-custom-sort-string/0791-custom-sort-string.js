/**
 * @param {string} order
 * @param {string} s
 * @return {string}
 */
var customSortString = function(order, s) {
    const charCount = {};
    for (const char of order) {
        charCount[char] = 0;
    }

    for (const char of s) {
        if (charCount[char] !== undefined) {
            charCount[char]++;
        }
    }

    let sortedS = '';
    for (const char of order) {
        sortedS += char.repeat(charCount[char]);
    }

    for (const char of s) {
        if (!order.includes(char)) {
            sortedS += char;
        }
    }

    return sortedS;
};
