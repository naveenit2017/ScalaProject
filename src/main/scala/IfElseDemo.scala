object IfElseDemo {
  //if else example

  def main(args: Array[String]): Unit = {
    var x=50;
    var res=""
    if(x==10) {
      res ="x==10"
    }
      else {
        res="x!=10"
      }
    println(res);
    println(if(x!=50) "X=56" else "x==30")

    }

}
