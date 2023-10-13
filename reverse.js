function reverseWordsInSentence(sentence) {
    
    var words = sentence.split(" ");
    var reversedWords = [];
        for (var i = 0; i < words.length; i++) {
        var word = words[i];
        var reversedWord = reverseWord(word);
        reversedWords.push(reversedWord);
    }
    
    // Join the reversed words to form the reversed sentence
    var reversedSentence = reversedWords.join(" ");
    
    return reversedSentence;
}

function reverseWord(word) {
    return word.split("").reverse().join("");
}


var inputSentence = "This is a sunny day";
var reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);
