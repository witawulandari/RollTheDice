
fun main () {
    try {
    var userlogin  = "username"

    do {
        print("Username: ")
        var username = readLine()
        userlogin = username.toString()
    } while (userlogin != null)

} catch (e: NullPointerException) {
    println("Input kosong")}

}