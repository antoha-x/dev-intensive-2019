package ru.skillbranch.dev_intensive.utils

object Utils {
    fun parseFullName(fullName: String?) : Pair<String?, String?>{
        val parts: List<String>? = fullName?.trim()?.split(" ")
        //val regex = """\W""".toRegex()
        //val parts: List<String>? = fullName?.let { regex.split(it) }

        //val firstName = (if (!parts.isNullOrEmpty() && parts.getOrNull(0) != "") "${parts.getOrNull(0)}" else null )
        //val lastName = (if (!parts.isNullOrEmpty() && parts.getOrNull(0) != "") "${parts.getOrNull(1)}" else null )

        val firstName = if (parts?.getOrNull(0) == "") null else parts?.getOrNull(0)
        val lastName = if (parts?.getOrNull(1) == "") null else parts?.getOrNull(1)

        //return Pair(firstName, lastName)
        return firstName to lastName
    }

    fun transliteration(payload: String, divider: String = " "): String {
        //TODO homework
        return "transliterations name"
    }

    fun toInitials(firstName: String?, lastName: String?): String? {

        //var initials: String?
        val firstLetter: String?
        val secondLetter: String?

        if (!firstName?.trim().isNullOrBlank() && firstName?.trim()?.toLowerCase() != "null") {
            firstLetter = firstName?.trim()?.take(1)?.toUpperCase()
        } else {
            firstLetter = null
        }

        if (!lastName?.trim().isNullOrBlank() && lastName?.trim()?.toLowerCase() != "null") {
            secondLetter = lastName?.trim()?.trim()?.take(1)?.toUpperCase()
        } else {
            secondLetter = null
        }

        if (firstLetter == null && secondLetter == null) return null
        if (firstLetter != null && secondLetter == null) return firstLetter
        if (firstLetter == null && secondLetter != null) return secondLetter

        return  firstLetter + secondLetter//"${firstName?.take(1)?.toUpperCase()?: ""}${lastName?.take(1)?.toUpperCase()?: ""}"
    }
}