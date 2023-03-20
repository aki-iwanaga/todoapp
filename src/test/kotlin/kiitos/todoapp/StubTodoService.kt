package kiitos.todoapp

class StubTodoServiceImpl  :TodoService {
    override fun getTodos():Todos {
        return Todos(listOf("todo1","todo2","todo3"))
    }

    override fun save(todo: String) {
        TODO("Not yet implemented")
    }
}