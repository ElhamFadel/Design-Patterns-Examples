package TextProcessor;

public abstract class TextProcessor {
    

    public abstract String[] tokenize(String text);
    public abstract String[] removeStopwords(String[] tokens);
    public abstract String[] stem(String[] tokens);
    public abstract String[] lemmatize(String[] tokens);
     

   // should be final to prevent subclasses from overriding
   //the aim force all developers to use the same method with same algorithm
   final public String processText(String input) {
        String[] tokens = tokenize(input);
        tokens = removeStopwords(tokens);
        tokens = stem(tokens);
        tokens = lemmatize(tokens);
        return String.join(" ", tokens);
    }
    
}
