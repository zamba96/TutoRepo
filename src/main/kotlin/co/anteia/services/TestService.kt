package co.anteia.services

import co.anteia.dtos.TestClass
import co.anteia.repos.TestClassRepo
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.ws.rs.NotFoundException

@ApplicationScoped
class TestService(
    //Injecta el repositorio respectivo
    @Inject
    val repo: TestClassRepo
) {

    fun create(ent: TestClass): TestClass {
        return repo.persist(ent)
    }

    fun listAll(): List<TestClass> {
        return repo.listAll()
    }

    fun deleteById(id: String): TestClass {
        val obj = repo.findById(id) ?: throw NotFoundException()
        return repo.delete(obj)
    }

    fun getById(id: String): TestClass {
        return repo.findById(id) ?: throw NotFoundException()
    }
}