package datamanager

import entity.Ride
import entity.User

class MemoryDataManager {
    class MemoryDataManager : DataManager {
        private val rides = mutableListOf<Ride>()
        private val usuarios = mutableListOf<User>()

        override fun agregarRide(ride: Ride) {
            rides.add(ride)
        }

        override fun obtenerRidesPorEstado(estado: String): List<Ride> {
            return rides.filter { it.estado == estado }
        }

        override fun agregarUsuario(usuario: User) {
            usuarios.add(usuario)
        }

        override fun obtenerUsuarioPorId(id: String): User? {
            return usuarios.find { it.id == id }
        }
    }
}