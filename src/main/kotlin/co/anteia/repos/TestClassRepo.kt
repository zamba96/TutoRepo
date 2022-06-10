package co.anteia.repos

import co.anteia.dtos.TestClass
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class TestClassRepo: TestRepoBase<TestClass>() {
}