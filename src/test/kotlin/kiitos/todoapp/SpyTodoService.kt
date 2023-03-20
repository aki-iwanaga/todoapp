package kiitos.todoapp

class SpyTodoServiceImpl :TodoService{
    var saveWasCalled = false
    var save_arg = ""

    override fun getTodos(): Todos {
        TODO("Not yet implemented")
    }
    override fun save(todo: String){
        save_arg = todo
        saveWasCalled = true
    }
}