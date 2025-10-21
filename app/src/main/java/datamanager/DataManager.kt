package datamanager

import entity.Ride
import entity.User

interface DataManager {
    fun agregarRide(ride: Ride)
    fun obtenerRidesPorEstado(estado: String): List<Ride>
    fun agregarUsuario(usuario: User)
    fun obtenerUsuarioPorId(id: String): User?
}