object Q4 extends App{
    class Account(id:String,n:Int,b:Double){

        val nic:String=id
        val acnumber:Int=n
        var balance:Double=b

        override def toString = "["+nic+":"+acnumber +":"+ balance+"]"
    }
    var bank:List[Account]=List(
        new Account("123",1,1000),
        new Account("456",2,-500),
        new Account("789",3,2500),
        new Account("296",4,-1000),
    )

    val overdraft=(b:List[Account])=>b.filter(x=>x.balance<0)
    val balance=(b:List[Account])=>b.reduce((x,y)=>new Account("",0,x.balance+y.balance))
    val interest=(b:List[Account])=>b.map(x=>if(x.balance>0) new Account(x.nic,x.acnumber,x.balance*1.05) else new Account(x.nic,x.acnumber,x.balance*1.1))

    println("List of Accounts with negative balances")
    println(overdraft(bank))
    println("\nSum of all account balances")
    println(balance(bank))
    println("\nFinal balances of all accounts after applying the interest function")
    println(interest(bank))
    
}

