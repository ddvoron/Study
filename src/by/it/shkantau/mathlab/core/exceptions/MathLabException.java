package by.it.shkantau.mathlab.core.exceptions;

/**
 * Created by Aliaksei on 13.09.2016.
 */
public class MathLabException extends Exception{

        public static final byte WRONG_FORMAT_STRING = 1;
    
        private byte errorCode;

        public MathLabException(){
        }

        public MathLabException(String message){
            super(message);
        }

        public MathLabException(String message, byte errorCode){
            super(message);
            this.errorCode = errorCode;
        }

        public byte getErrorCode(){
            return errorCode;
        }
    
}