package co.anteia.dtos

/**
 * Esta clase extiende TestEntityBase para que pueda ser utilizada con un TestRepoBase
 */
data class TestClass(
    var testValue: String? = null
) : TestEntityBase()
