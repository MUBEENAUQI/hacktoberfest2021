//javascript program to check if 2 string are anagram or not
const isAnagram = (str1, str2) => {
  const normalize = str =>
    str
      .toLowerCase()
      .replace(/[^a-z0-9]/gi, '')
      .split('')
      .sort()
      .join('');
  return normalize(str1) === normalize(str2);
};
console.log(isAnagram('java', 'avja')); 
console.log(isAnagram('ice', 'icc'));

//output
//true
//false
