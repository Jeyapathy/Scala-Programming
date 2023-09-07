object scala_basic {
  def test(x:Int, y:Int) : Boolean =
  {
    x >30 || y < 30 || x + y == 30
  }
  def main(args: Array[String]):Unit = {
  println("Result: " + test(30, 0));
  println("Result: " + test(25, 5));
  println("Result: " + test(30, 20));
  println("Result: " + test(25, 20));
    
  } 
  
}

object scala_basic {
  def test(x:Int) : Boolean = {
    Math.abs(100 - x) <= 20 || Math.abs(300 - x) <= 20
    
  }
  def main(args: Array[String]): Unit = {
    println("Result: " + test(115));
    println("Result: " + test(200));
    println("Result: " + test(250));
    println("Result: " + test(70));
    
  }
  
}
