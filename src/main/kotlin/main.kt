fun main() {
    val likes: Int = 111;
    var people_humans: String = "Людям";

    if (likes.toString().last() == '1') {
        people_humans = "Человеку";
    }

    println("Понравилось $likes $people_humans");
}