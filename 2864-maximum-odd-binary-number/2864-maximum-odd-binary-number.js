/**
 * @param {string} s
 * @return {string}
 */
const maximumOddBinaryNumber = (s) => {
    // Count the number of ones in the string
    const onesCount = (s.match(/1/g) || []).length;
    // Calculate the number of zeros
    const zerosCount = s.length - onesCount;

    // Construct the maximum odd binary number by adding (onesCount - 1) '1's followed by zeros and one '1'
    return "1".repeat(onesCount - 1) + "0".repeat(zerosCount) + "1";
};