package co.anteia.routers

import co.anteia.dtos.TestClass
import co.anteia.services.TestService
import javax.inject.Inject
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("testRouter")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class TestRouter(
    //Injectar el servicio
    @Inject
    var service: TestService
) {
    //Crear los endpoints, este quedaria en POST /testRouter
    @POST
    fun create(ent: TestClass): TestClass {
        return service.create(ent)
    }

    @GET
    fun getAll(): List<TestClass> {
        return service.listAll()
    }

    @DELETE
    @Path("delete/{id}")
    fun delete(@PathParam("id") id: String): TestClass {
        return service.deleteById(id)
    }

    @GET
    @Path("getById/{id}")
    fun getById(@PathParam("id") id: String): TestClass {
        return service.getById(id)
    }





}