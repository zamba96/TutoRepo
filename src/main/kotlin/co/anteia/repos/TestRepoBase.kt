package co.anteia.repos

import co.anteia.dtos.TestEntityBase
import co.anteia.utils.KeyGenerator

abstract class TestRepoBase<T : TestEntityBase> {

    private val data: MutableMap<String, T> = mutableMapOf()

    private fun genId(): String {
        return KeyGenerator().generateKey(12)
    }

    fun persist(obj: T): T {
        obj.id = genId()
        data[obj.id!!] = obj
        return obj
    }

    fun findById(id: String): T? {
        return data[id]
    }

    fun listAll(): List<T> {
        val list = mutableListOf<T>()
        data.values.forEach {
            list.add(it)
        }
        return list
    }

    fun update(obj: T): T {
        if (obj.id == null) throw Exception("Object does not exist (Id is null)")
        if (data.containsKey(obj.id)) {
            data[obj.id!!] = obj
            return obj
        } else {
            throw Exception("Object with id: ${obj.id} does not exist")
        }
    }

    fun delete(obj: T): T {
        if (obj.id == null) throw Exception("Object does not exist (Id is null)")
        if (data.containsKey(obj.id)) {
            data.remove(obj.id)
            return obj
        } else {
            throw Exception("Object with id: ${obj.id} does not exist")
        }
    }
}