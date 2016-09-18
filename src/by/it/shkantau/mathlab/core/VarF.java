package by.it.shkantau.mathlab.core;

/**
 * Created by Aliaksei on 11.09.2016.
 */
public class VarF extends Var {

    public double value;
// Constructor
    public VarF(double v){
        this.value = v;
    }

    public VarF(String str){
        setFrom( str);
    }

    @Override
    public String toString() {
        return ((Double)value).toString();
    }

    @Override
    public void setFrom(String str) {
        try {Double.parseDouble(str);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }
    }

    // Addition
    @Override
    public Var add(VarF d) {
        return new VarF(this.value + d.value);
    }
    @Override
    public Var add (VarV v){
        return v.add(this);
    }
    @Override
    public Var add (VarM m){
        return m.add(this);
    }

//   Subtraction
    @Override
    public Var sub(VarF d) {
    return new VarF(this.value - d.value);
    }

//   Multiplication
    @Override
    public Var mul(VarF d) {
        return new VarF(this.value * d.value);
    }
    @Override
    public Var mul (VarV v) {
        return v.mul(this);
    }
    @Override
    public  Var mul (VarM m){
        return m.mul(this);
    }
//  Division
    @Override
    public Var div (VarF s){
        return new VarF(this.value / s.value);
    }
    @Override
    public Var div (VarV v){
        return v.div(this);
    }

}