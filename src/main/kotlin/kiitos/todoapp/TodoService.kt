package kiitos.todoapp

import org.springframework.stereotype.Service

interface TodoService {
    fun getTodos():Todos
    fun save(todo: String)
}

@Service
class TodoServiceImpl(val todoRepository: TodoRepository):TodoService {
    override fun getTodos() :Todos{
        var res =  todoRepository.findAll().map { it.todo }
        return Todos(res)
    }

    override fun save(todo: String) {
        todoRepository.save(TodoRecord(todo=todo))
    }
}