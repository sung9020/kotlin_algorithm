import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main(){
    var s = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
    print(s)
}
