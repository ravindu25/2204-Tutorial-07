//Implement a Data Structure for Account and create a method transfer which transfer a certainb amount of money from this account to a given account.

object Q3 extends App{

    class Account(id:String,n:Int,b:Double){

        val nic:String=id

        val acnumber:Int=n

        var balance:Double=b

        def transfer(a:Account,amt:Double)={
            if(a.balance>amt){
                this.balance=this.balance-amt
                a.balance=a.balance+amt
            }else{
                println("Insufficient Balance")
            }
        }

        override def toString = "["+nic+":"+acnumber +":"+ balance+"]"
    }

    var a1=new Account("123",1,1000)
    var a2=new Account("456",2,2000)

    println(a1)
    println(a2)

    a1.transfer(a2,500)

    println(a1)
    println(a2)


}

