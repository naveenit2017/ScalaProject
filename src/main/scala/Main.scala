object Main {
  def main(args: Array[String]): Unit = {
    println("welcome to naveen world")
    val name="naveen"
    val age=30
    println(name+" is "+ age +"years old") //directly calling by using the variable
    println(s"$name is $age years old" )   //s interpolation
    println(f"$name%s is $age%d years old")
    println(raw"hello \n boss")
    println("hell \n boss")

  }
}