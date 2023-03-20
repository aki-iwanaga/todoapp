package kiitos.todoapp

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Primary
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

data class TodoBody(
	val todo: String
)

@RestController
@RequestMapping("/api/todo")
class TodoController(
	val todoService: TodoService
) {
	@GetMapping()
	fun getTodos():Todos {
		try {
			return todoService.getTodos()
		} catch(e: Exception) {
			throw ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR)
		}
	}
	@PostMapping("/{id}")
	fun postTodo(
		@PathVariable id: String,
		@RequestBody param: TodoBody
	){
		println("aaaaa")
//		todoService.save(param.todo)
		todoService.save("")
	}
}
