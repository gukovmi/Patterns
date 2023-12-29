fun main() {
    val dialog = Dialog()
    println(dialog.toString())

    println("click checkbox")
    dialog.checkBox.click()
    println(dialog.toString())

    println("click button")
    dialog.button.click()
}