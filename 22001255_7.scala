object FunctionalProgrammingExamples {

  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(n => n % 2 == 0)
  }

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(n => n * n)
  }

  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else (2 until n).forall(d => n % d != 0)
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(n => isPrime(n))
  }

  def main(args: Array[String]): Unit = {
    val inputList1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val inputList2 = List(1, 2, 3, 4, 5)

    println("Filtered Even Numbers: " + filterEvenNumbers(inputList1))  
    println("Squares of Numbers: " + calculateSquare(inputList2))     
    println("Filtered Prime Numbers: " + filterPrime(inputList1))       
}
}
