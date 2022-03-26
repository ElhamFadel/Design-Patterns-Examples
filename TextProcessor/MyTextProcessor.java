package TextProcessor;

public class MyTextProcessor extends TextProcessor {
    
    public String[] tokenize(String text) {
        return text.split(" ");
    }
    
    public String[] removeStopwords(String[] tokens) {
        return tokens;
    }
    
    public String[] stem(String[] tokens) {
        return tokens;
    }
    
    public String[] lemmatize(String[] tokens) {
        return tokens;
    }
}
