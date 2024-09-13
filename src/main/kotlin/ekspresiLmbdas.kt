fun main(args: Array<String>) {
    println(MyFunction("rekayasa Perangkat Lunak"))
    //lambda fungsi
    val mylambda :(String)->Unit = {s:String-> print(s) }
    val v:String = "Jurusan Teknik Informatika"
    mylambda(v)
    //inline fungsi
    myFun(v,mylambda)//passing lambda as a parameter of another function

}
fun MyFunction(x: String): String {
    var c:String = "Hey!! Welcome To ---"
    return (c+x)
}

fun myFun(a:String, action:(String)->Unit) { //passing lambda
    print("\nHeyyy!!!")
    action(a)// call to lambda function
}