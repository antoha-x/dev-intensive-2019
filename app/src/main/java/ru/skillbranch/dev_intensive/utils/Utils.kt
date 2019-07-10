package ru.skillbranch.dev_intensive.utils

object Utils {
    fun parseFullName(fullName: String?) : Pair<String?, String?>{
        val parts: List<String>? = fullName?.trim()?.split(" ")

        val firstName = (if (!parts.isNullOrEmpty() && parts.getOrNull(0) != "") "${parts.getOrNull(0)}" else "null" )
        val lastName = (if (!parts.isNullOrEmpty() && parts.getOrNull(0) != "") "${parts.getOrNull(1)}" else "null" )

        //return Pair(firstName, lastName)
        return firstName to lastName
    }

    fun transliteration(payload: String, divider: String = " "): String {
        //TODO homework
        return "transliterations name"
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        //TODO homework
        return "AA"
    }
}