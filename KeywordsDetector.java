public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market", 
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        
        for (int i = 0; i < sentences.length; i++){
            String sentenceToCheck = sentences[i];
            System.out.println("Sentence: " + sentenceToCheck);

            for (int j = 0; j < keywords.length; j++){
                String keywordToCheck = keywords[j];
                System.out.println("Keyword: " + keywordToCheck);
                
                if (contains(sentenceToCheck, keywordToCheck)){
                    System.out.println("contain");
                    break;
                }

            }
        }
        

    }

    public static boolean contains(String str1, String str2) {

        if (str1 == ""){
            return false;
        }else if (str2 == ""){
            return true;
        }

        char charToCheck = str2.charAt(0);
        for (int j = 0; j < str1.length()-1; j++){
            if (charToCheck == str1.charAt(j)) {
                System.out.println("Found first letter");
                for (int i = 0; i < str2.length(); i++ ){
                    if (str2.charAt(i) != str1.charAt(j)) {
                        System.out.println("Found not equal "+ str2.charAt(i) +" " + str1.charAt(j));
                        break;
                    }
                    j++;
                    if (i == str2.length()-1){
                        return true;
                    }
                }
               
            }
        }
        return false;
    }
}
