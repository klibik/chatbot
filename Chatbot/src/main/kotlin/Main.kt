fun main() {
    println("Привіт! Як Вас звати?")
    val ім_користувача = readLine()
    println("Приємно познайомитись, $ім_користувача!")
    println("Дайте я спробую відгадати ваш вік. Введіть залишок від ділення на 3:")
    val remainder3 = readLine()?.toIntOrNull() ?: 0
    println("Добре. Введіть залишок від ділення на 5:")
    val remainder5 = readLine()?.toIntOrNull() ?: 0
    println("Ок. Введіть залишок від ділення на 7:")
    val remainder7 = readLine()?.toIntOrNull() ?: 0
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Ваш вік - $age. Чи вірно я вгадав?")
    println("Давайте я вам покажу що я можу рахувати до будь якого числа:")
    val number = readLine()?.toIntOrNull() ?: 0
    if (number <= 0) {
        println("Ви ввели некоректне число")
        return
    }
    for (i in 0..number) {
        println(i)
    }
    println("Ласкаво просимо до тестування по перевірці ваших знань! Відповідайте на запитання цифрою, наприклад: 1.")
    var answer: String?
    do {
        println("Який рік створення Bard от Google?")
        println("1. 2005")
        println("2. 1955")
        println("3. 2023")
        answer = readLine()
    } while (answer != "3")
    println("Вітаємо! Ви правильно відповіли на запитання! До зустрічі!")
}




