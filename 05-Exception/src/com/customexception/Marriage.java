package com.customexception;

public class Marriage {
    public static void main(String[] args) {

        String def = """
                -> We can define our own exception by extending RuntimeException class.
                -> It is highly recommended to maintain our customized exceptions as unchecked by
                   extending RuntimeException.
                """;
        System.out.println(def);

        for(int i=0;i<=32;i++){
            if(i==31){
                System.out.println(i);
                throw new MarriageException("Let's marry Dileep");
            }
        }
    }
}
