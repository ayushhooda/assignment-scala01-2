class MainClass {
  // list display with indexes
  def listDisplay(list: scala.List[Int]): Unit = {
    for(i <- list) {
      println(s"${list.indexOf(i)} = $i")
    }
  }

  // finding maximum element in list
  def findMaximumElement(list: scala.List[Int]): Int = {
    val tempList = list.sorted
    val maxNumber:Int = tempList(list.length - 1)
    maxNumber
  }

  // Finding nth Fibonacci Number (series is assumed to be starting from 1)
  def fibonacci(n: Int): Int = {
    if(n <= 1)
      n
    else
      fibonacci(n-1) + fibonacci(n-2)
  }

  // Multiple of digits of number 1 to n
  def multipleOfDigits(number: Int): Int = {
    if(number<=1)
      number
    else
      number * multipleOfDigits(number-1)
  }

  // Sum of digits of Multiplied numbers
  def sumOfDigits(number: Int): Int = {
    if(number != 0)
      (number % 10) + sumOfDigits(number / 10)
    else
      0
  }
}

object MainClass {
  def main(args: Array[String]) = {
    val MainClassObject = new MainClass

    // List's methods call
    val list = List(4,1,2,3)
    MainClassObject.listDisplay(list)
    val maxNumber = MainClassObject.findMaximumElement(list)
    println(s"Maximum Number in List = $maxNumber")

    // Number's methods call
    val number = 5
    val nthFibonacci = MainClassObject.fibonacci(number)
    val multipleOfDigit = MainClassObject.multipleOfDigits(number)
    val sumOfDigit = MainClassObject.sumOfDigits(multipleOfDigit)
    println(s"$number th Fibinacci Number = $nthFibonacci")
    println(s"Sum of First $number digits = $sumOfDigit")
  }
}