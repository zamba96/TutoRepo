package co.anteia.services

import co.anteia.dtos.TestClass
import co.anteia.repos.TestClassRepo
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject

@ApplicationScoped
class TestService(
    @Inject
    val repo: TestClassRepo
) {

    fun create(ent: TestClass): TestClass {
        return repo.persist(ent)
    }

    fun listAll(): List<TestClass> {
        return repo.listAll()
    }
}