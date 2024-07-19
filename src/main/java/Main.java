import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName("G:\\Мой диск\\УЧЕБА\\Мага\\2 курс\\2.2_КК\\ANTLR\\target\\classes\\code.txt");
        GrammarLexer lexer = new GrammarLexer((input));
        GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        SemanticVisitor semanticVisitor = new SemanticVisitor();
        semanticVisitor.visit(tree);
    }
}
