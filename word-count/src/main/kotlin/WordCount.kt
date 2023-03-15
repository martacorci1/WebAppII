object WordCount {
    private val word = Regex("[a-zA-Z0-9]+('[a-zA-Z]+)?")
    fun phrase(phrase: String): Map<String, Int> {
        var map = mutableMapOf<String,Int>()
        word.findAll(phrase).forEach {
            val s = it.value.lowercase()
            if(map.containsKey(s)){
                map[s] = map[s]!! + 1
            }else{
                map[s] = 1
            }
        }
        return map
    }
}
