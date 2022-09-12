object Q2 extends App{
    class Rational(x:Int,y:Int){
        def numer=x
        def denom=y
    }

    def sub(x:Rational,y:Rational,z:Rational)={
        val a=new Rational(x.numer*y.denom-x.denom*y.numer,x.denom*y.denom)
        val b=new Rational(a.numer*z.denom-a.denom*z.numer,a.denom*z.denom)
        println(b.numer+"/"+b.denom)
    }

    val x=new Rational(3,4)
    val y=new Rational(5,8)
    val z=new Rational(2,7)
    sub(x,y,z)

    
}