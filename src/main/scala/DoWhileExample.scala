object DoWhileExample {
  def main(args: Array[String]): Unit = {
    var x = 0;
    while (x < 10) {
      x += 1;
      println("x=" + x)
    }
    var y = 0;
    do {
      println("y=" + y);
      y+=1;
    }
    while (y < 10);


    }


  }
