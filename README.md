# esoteric-lingo
A compiler for  [Brain Fuck](http://en.wikipedia.org/wiki/Brainfuck) and [Ook!](http://en.wikipedia.org/wiki/User:The_wub/Ook!)
language.

The idea is to have mode of communication slightly over management.
Or rather technical non-sense.

You are welcome to use this to encode any text message.

Typical usage : 

    $ java -jar target/el.ook-0.1-SNAPSHOT.jar 
    Greetings, Let me present you this program:- 
    Usage : java -jar ook.jar [lingo] [-e] [-s:<size>].
    lingo : -bf  --> BrainFuck! 
    lingo : -ook --> Ook! 
    With -s:<size> in the end : SIZE of the TAPE, default is : 1024 BYTES.
    With -e in the end, ENCODES Homo Sapiens ENGLISH INTO Alianize[BrainFuck] or Pongo[Ook!].
    If you are running it now, it is highly probable that you are without any life.
    --Noga.


And a real usage : 

     $ java -jar target/el.ook-0.1-SNAPSHOT.jar -bf -e 
     [press EOF to exit, which in UNIX is CTRL-D and in WINDOWS CTRL-Z]
     <I have used some secret message, but the output can be decoded >
    +++++ +++++ [ >+++++++++ <- ] >-------------.++++++++++++++++++++.+++++++++++++.
    -------------.++++++.--.++++++++.--------.+++++++++.++++++.----------------------
    --------------------------------------------------------------.++++++++++++++++++
    +++++++++++++++++++++++++++++++++++++++++++++++++++++++.++++++++++.--------------
    ---------------------------------------------------------------------.++++++++++++
    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.++.++++.+.-------
    -.+++++++++++++.-------------------------------------------------------------------
    ----------------------.++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    ++++++.+++++++++++++++++++.---------..+++++++.-----------.+.+++++++++++.-----------
    ------------------------------------------------------------------------.
    
    
Now, you can decode the string. back.    
    
