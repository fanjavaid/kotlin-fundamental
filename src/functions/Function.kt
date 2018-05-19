package functions

fun log(tag: String, value: Any) {
    println("$tag:")
    println(value)
    println()
}

fun main(args: Array<String>) {
    log("Function Declarations", double(5))
    log("Default Arguments", showDialog("Scoreboard", type = 1))
    log("Overriding Methods", InfoDialog().showPopup("Information"))
    log("Default Parameter in first position", fetchData(offset = 2))
    log("Lambda in last position", mapList(mutableListOf("Fandi","Akhmad")) { /* Do actions */ })
    log("Named arguments", reformat("Hello Kotlin", false, '-'))
    log("Named arguments with vararg", getListAtIndex(list = *arrayOf("Fandi", "Akhmad", "Oke"), index = 2))
}

// Function Declarations
fun double(x: Int): Int {
    return 2 * x
}

// Default Arguments
fun showDialog(title: String, message: String? = null, type: Int = 0): String {
    return "Dialog showing with property [title=$title, message=$message, type=$type]"
}

// Overriding methods
open class Dialog {
    open fun showPopup(title: String, message: String? = null): String {
        return "Dialog showing with property [title=$title, message=$message]"
    }
}

class InfoDialog : Dialog() {
    override fun showPopup(title: String, message: String?): String {
        return "[Information] Dialog showing with property [title=$title, message=$message]"
    }
}

// Default Parameter in first position
fun fetchData(limit: Int = 10, offset: Int): String {
    return "Fetching from $offset as much $limit"
}

// Lambda in last position
fun mapList(list: MutableList<String>? = null, flags: Int = -1, actions: () -> Unit): String {
    return "list = $list, flags = $flags"
}

// Named arguments
fun reformat(str: String, normalizeCase: Boolean = true, wordSeparator: Char) {}

// Named arguments with vararg
fun getListAtIndex(index: Int = 0, vararg list: String): String {
    return "Value = ${list[index]}"
}

// Single expression functions
fun doubleSimple(x: Int) = 2 * x