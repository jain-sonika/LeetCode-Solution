/**
 * @param {number[]} nums
 * @return {number}
 */
var maxFrequencyElements = function(nums) {
    const freqCounter = new Map();
    for (const num of nums) {
        freqCounter.set(num, (freqCounter.get(num) || 0) + 1);
    }

    const maxFrequency = Math.max(...freqCounter.values());

    const maxFreqElements = [...freqCounter.keys()].filter(num => freqCounter.get(num) === maxFrequency);

    const totalFrequency = maxFrequency * maxFreqElements.length;

    return totalFrequency;
};