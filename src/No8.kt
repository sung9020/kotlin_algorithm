/*
*
* @author 123msn
* @since 2019-11-13
*/
import java.util.*


fun main(args:Array<String>){
    val scan = Scanner(System.`in`)
    var a = scan.nextInt()
    var b = scan.nextInt()
    var c = scan.nextInt()

    var A = (a + b) %c
    var B = (a % c + b % c) %c
    var C = (a * b) %c
    var D = (a % c * b % c) % c
    println(A)
    println(B)
    println(C)
    println(D)
}