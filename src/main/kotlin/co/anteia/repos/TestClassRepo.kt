package co.anteia.repos

import co.anteia.dtos.TestClass
import javax.enterprise.context.ApplicationScoped

/**
 * Esta clase extiende TestRepoBase para poder "persistir" la información en memoria
 * y para eso se usa @ApplicationScoped. Se pueden agregar nuevos métodos para realizar tareas específicas
 * Y pues hereda los métodos que tiene TestRepoBase como persist, update, findById y delete
 */
@ApplicationScoped
class TestClassRepo: TestRepoBase<TestClass>() {
}