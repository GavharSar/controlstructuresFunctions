val minSecond = 0
val minute = 60
val hour = 3600
val day = 86_400
val seconds = 65
fun main() {
    var text = agoToText()
    println(text)

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

fun minuteText(amount: Int): String = when (amount) {
    1 -> "минуту"
    2, 3, 4 -> "минуты"
    else -> "минут"
}

fun hoursText(amount: Int): String = when (amount) {
    1 -> "час"
    2, 3, 4 -> "часа"
    else -> "часов"
}


