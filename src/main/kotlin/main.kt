fun main() {
    val likes: Int = 2;

    var peopleHumans: String = "людям";
    if (likes % 10 == 1 && likes % 100 != 11) {
        peopleHumans = "человеку";
    }

    println("Понравилось $likes $peopleHumans");
}