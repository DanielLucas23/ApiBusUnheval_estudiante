package com.systemdk.apibusunheval_estudiante.providers

import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.FirebaseMessaging
import com.systemdk.apibusunheval_estudiante.models.Estudiante

class EstudianteProvider {

    val db = Firebase.firestore.collection("Estudiantes")

    fun create(estudiante: Estudiante): Task<Void> {
        return db.document(estudiante.id!!).set(estudiante)
    }

    fun getClienById(id: String): Task<DocumentSnapshot> {
        return db.document(id).get()
    }

//    fun createToken(idEstudiante: String){
//        FirebaseMessaging.getInstance().token.addOnCompleteListener {
//            if (it.isSuccessful){
//                val token = it.result //TOKEN DE NOTIFICACIONES
//                updateToken(idEstudiante, token)
//            }
//        }
//    }
//
//    fun updateToken(idEstudiante: String, token: String): Task<Void> {
//        val map: MutableMap<String, Any> = HashMap()
//        map["token"] = token
//        return db.document(idEstudiante).update(map)
//    }

}