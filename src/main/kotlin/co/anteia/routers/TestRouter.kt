package co.anteia.routers

import co.anteia.dtos.TestClass
import co.anteia.repos.TestClassRepo
import co.anteia.services.TestService
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path

@Path("test")
class TestRouter(
    @Inject
    var service: TestService
) {

    @POST
    fun create(ent: TestClass): TestClass {
        return service.create(ent)
    }

    @GET
    fun getAll(): List<TestClass> {
        return service.listAll()
    }



}