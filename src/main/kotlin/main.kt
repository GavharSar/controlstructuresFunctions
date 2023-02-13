val minSecond = 0
val minute = 60
val hour = 3600
val day = 86_400
val seconds = 32_000
fun main() {
    var text = agoToText()
    println("был(а) $text")

}
fun agoToText(): String = when (true) {
        seconds >= minSecond && seconds <= minute -> "только что"
        seconds > minute && seconds <= hour -> "${amountMinutes()} ${minuteText(amountMinutes())} назад"
        seconds > hour && seconds <= day -> "${amountHours()} ${hoursText(amountHours())} назад"
        seconds > day && seconds <= day * 2 -> "вчера"
        seconds > day * 2 && seconds <= day * 3 -> "позавчера"
        else -> "давно"
}

fun amountMinutes(): Int {
    return seconds / minute
}

fun amountHours(): Int {
    return seconds / hour
}

fun minuteText(amount: Int): String = when (true) {
    amount % 10 == 1 && amount % 100 != 11-> "минуту"
    amount % 10 == 2 ||  amount % 10 == 3 || amount % 10 == 4 -> "минуты"
    else -> "минут"
}

fun hoursText(amount: Int): String = when (true) {
    amount % 10 == 1 && amount % 100 != 11 -> "час"
    amount % 10 == 2 ||  amount % 10 == 3 || amount % 10 == 4 -> "часа"
    else -> "часов"
}


