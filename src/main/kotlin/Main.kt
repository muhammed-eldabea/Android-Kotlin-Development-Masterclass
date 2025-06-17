import Calculator.Companion.sum

fun main(args: Array<String>){





}


class Account (val  accountName : String)
{
    var balance: Double = 0.0
        private set(value) {
            field = if (value < 0) 0.0 else value
        }
    var transactions: MutableList<Double> = mutableListOf()

    fun deposit(amount: Double)  {
        if (amount < 0) {
//            throw IllegalArgumentException("Deposit amount must be positive")
            println("Deposit amount must be positive")
        }
        transactions.add(amount)
        balance += amount
        println("Deposited: $amount, New Balance: $balance")
    }
    fun withdraw(amount: Double)  {
        if (amount < 0) {
//            throw IllegalArgumentException("Withdrawal amount must be positive")
            println("Withdrawal amount must be positive")
        }
        if (amount > balance) {
//            throw IllegalArgumentException("Insufficient funds")
            println("Insufficient funds")

        }
        balance -= amount
        transactions.add(-amount)
    }
    fun printTransactions() {
        println("Transactions for $accountName:")
        transactions.forEach { println(it) }
    }
}