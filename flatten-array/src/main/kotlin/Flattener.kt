object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        var result : List<Any> = emptyList()
        for (element in source) {
            if(element != null) {
                result = if(element is List<*>) {
                    result.append(flatten((element as List<Any>)))
                } else {
                    result.plus(element)
                }
            }
        }
        return result
    }
}
fun <T> List<T>.append(list: List<T>): List<T> {
    var ret : List<T> = this
    list.forEach {
        ret = ret.plus(it)
    }
    return ret
}
