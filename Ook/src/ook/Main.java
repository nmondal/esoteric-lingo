/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ook;
import java.io.Console;

/**
 *
 * @author nmondal
 */
public class Main {

    
    static void Encode(Encoder encoder)
    {
        String text = "";
        String line = "";
        Console console = System.console();
        System.out.println("[press EOF to exit, which in UNIX is CTRL-D and in WINDOWS CTRL-Z]");
        
        while ( true )
        {
            
            try
            {
                line = console.readLine();
                
                if ( line == null )
                {
                    break;
                }
                line = line.trim();
                
                if ( !line.isEmpty() )
                {
                    text+= line;
                }
            }
            catch(Exception e)
            {
                break;
            }
        }
        encoder.encode(text);
    }
    
    static void Decode(Interpreter interpreter)
    {
        String program = "";
        String line = "";
        Console console = System.console();
        System.out.println("[press EOF to exit, which in UNIX is CTRL-D and in WINDOWS CTRL-Z]");
        
        while ( true )
        {
            
            try
            {
                line = console.readLine();
                
                if ( line == null )
                {
                    break;
                }
                line = line.trim();
                
                if ( !line.isEmpty() )
                {
                    program+= line;
                }
            }
            catch(Exception e)
            {
                break;
            }
        }
        interpreter.interpreteAndRun(program);
        //interpreter.interpreteAndRun(helloWorld_OOK);
    }
    
    
    static final String helloWorld_BF="++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.";
    static final String helloWorld_OOK= Interpreter.compileFromBF_2_OOK(helloWorld_BF);
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Interpreter interpreter = new Interpreter(Interpreter.InterpreterLanguage.OOK);
        Encoder encoder = new Encoder(Interpreter.InterpreterLanguage.OOK );
        if ( args.length == 0 )
        {
            System.out.printf("Greetings, Let me presnt you this program:- \n" );
            System.out.printf("Usage : java -jar ook.jar [lingo] [-e].\n");
            System.out.printf("lingo : -bf  --> BrainFuck! \n");
            System.out.printf("lingo : -ook --> Ook! \n");
            System.out.printf("With -e in the end, ENCODES Homo Sapiens ENGLISH INTO Alianize[BrainFuck] or Pongo[Ook!].\n" );
            System.out.printf("If you are running it now, it is highly probable that you are without any life.\n" );
            System.out.printf("--Noga.\n" );
            System.exit(23);
        }
        
        
        
        if ( args.length == 2 && args[1].equalsIgnoreCase("-e"))
        {
            //Instead of decode, encode.
            if ( args[0].equalsIgnoreCase("-ook")) 
            {
                
            }
            else if ( args[0].equalsIgnoreCase("-bf") )
            {
                encoder = new Encoder(Interpreter.InterpreterLanguage.BRAINFUCK );
                
            }
            Encode(encoder);
        }
        else
        {
            if ( args[0].equalsIgnoreCase("-ook")) 
            {

            }
            else if ( args[0].equalsIgnoreCase("-bf") )
            {
                interpreter = new Interpreter(Interpreter.InterpreterLanguage.BRAINFUCK);
            }
            Decode(interpreter);
        }
        
        
        System.out.printf("{It is Highly probable that you are without any life.\n" );
        System.out.printf("--Noga.}\n" );
    }
}
