package com.systemdk.apibusunheval_estudiante.models

import com.beust.klaxon.*

private val klaxon = Klaxon()

data class Estudiante (
    val id: String? = null,
    val names: String? = null,
    val email: String? = null,
    val phone: String? = null,
    val image: String? = null
) {

    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<Estudiante>(json)
    }
}