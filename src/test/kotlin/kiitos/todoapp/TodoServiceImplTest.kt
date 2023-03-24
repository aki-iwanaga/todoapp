package kiitos.todoapp

import org.h2.command.dml.MergeUsing.When
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TodoServiceImplTest{
    val spyStubTodoRepository = SpyStubTodoRepository()
    val todoService = TodoServiceImpl(spyStubTodoRepository)

    @Test
    fun `getTodoを呼んだ時、リポジトリにTodoListを受け取る`(){
//        WHEN
        val result = todoService.getTodos()
//        THEN
        assertTrue(spyStubTodoRepository.findAllWasCalled)
        assertEquals(Todos(listOf("todo1", "todo2")), result)
    }
    @Test
    fun `saveを呼んだ時、リポジトリに登録依頼する`(){
//        WHEN
        todoService.save("todo1")
//        THEN
        assertTrue(spyStubTodoRepository.saveWasCalled)

    }
}