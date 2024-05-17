fun main() {
    var rectangle= Rectangle(10.6, 6.5)
    println(rectangle.findArea())
    var bankAccount = BankAccount("Ac24456","Agnes",400000.00)
    bankAccount.depositAmount(56784.00)
    bankAccount.withdrawAmount(543270.00)
    bankAccount.checkBalance()
    println( reverseString("information"))
//    println(findNumber(arrayOf(34,67,43,12,45)))
    val number = 29
    val isPrime = isPrime(number)
    println("$number is a prime number: $isPrime")
}
class Rectangle(var length:Double, var width:Double){
    fun findArea():Double{
        return length * width
    }
}
class BankAccount(var accountNo: String,var account:String,var balance:Double) {
    fun depositAmount(amount: Double) {
        balance += amount
        println("You have deposited $amount your balance is $balance ")
    }
    fun withdrawAmount(amount: Double) {
        if (amount < balance) {
            balance -= amount
            println("you have withdrawn $amount and your balance is $balance")
        } else {
            println("insufficient balance")
        }
    }
    fun checkBalance(){
        println("your balance is $balance ")
    }
}
fun reverseString(sentence: String):String {
    var newWord = sentence.toCharArray()
    var rightpointer = newWord.size- 1
    var leftpointer = 0
    while (leftpointer < rightpointer) {
        var temp = newWord[leftpointer]
        newWord[leftpointer] = newWord[rightpointer]
        newWord[rightpointer] = temp
        rightpointer--
        leftpointer++
    }
    return String(newWord)
}
fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2 until num) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}





fun findNumber(numbers:Array<Int>):Array<Int>{
    for(number in numbers)
        if (numbers.count() ==1){
         println(numbers)
        }
    else{
        println("number appears more than once")
        }
    return (numbers)
}
