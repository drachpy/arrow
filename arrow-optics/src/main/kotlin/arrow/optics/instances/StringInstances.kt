package arrow.optics.instances

import arrow.optics.Iso

/**
 * [Iso] that defines equality between String and [List] of [Char]
 */
val stringToList: Iso<String, List<Char>> = Iso(
        get = CharSequence::toList,
        reverseGet = { it.joinToString(separator = "") }
)
