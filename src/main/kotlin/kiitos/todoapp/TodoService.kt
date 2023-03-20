package kiitos.todoapp

import org.springframework.stereotype.Service

interface TodoService {
    fun getTodos():Todos
    fun save(todo: String)
}

@Service
class TodoServiceImpl:TodoService {
    override fun getTodos() :Todos{
        return Todos(listOf(""))
    }

    override fun save(todo: String) {
        TODO("Not yet implemented")
    }
}