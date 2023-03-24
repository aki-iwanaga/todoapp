package kiitos.todoapp

import com.ninjasquad.springmockk.SpykBean
import io.mockk.every
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureMockRestServiceServer
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders

@SpringBootTest
@AutoConfigureMockRestServiceServer
@AutoConfigureMockMvc
class TodoControllerTests {
	private fun makeSubject(config: TodoService): MockMvc {
		return MockMvcBuilders.standaloneSetup(
			TodoController(config)
		).build()
	}

	@Test
	fun `get要求された場合、200OKと正しい値を返す`() {
//		GIVEN
		val stubTodoService = StubTodoServiceImpl()
//		WHEN
		makeSubject(stubTodoService)
			.perform(MockMvcRequestBuilders.get("/api/todo"))
//		THEN
			.andExpect(MockMvcResultMatchers.status().isOk)
			.andExpect(MockMvcResultMatchers.jsonPath("$.todos[0]").value("todo1"))
			.andExpect(MockMvcResultMatchers.jsonPath("$.todos[1]").value("todo2"))
			.andExpect(MockMvcResultMatchers.jsonPath("$.todos[2]").value("todo3"))
	}

	@Test
	fun `get要求失敗すると、エラーを返す`() {
//		todo
//		GIVEN
//		WHEN
//		THEN
	}

	@Test
	fun `post要求された場合、200OKを返し、serviceのsaveにBodyを渡して呼ぶ`() {
//		GIVEN
		val spyTodoService = SpyTodoServiceImpl()

//		WHEN
		makeSubject(spyTodoService)
			.perform(MockMvcRequestBuilders.post("/api/todo")
				.contentType(MediaType.APPLICATION_JSON)
				.content("""{"todo": "todo1"}""")
			)
//		THEN
			.andExpect(MockMvcResultMatchers.status().isOk)

		assertTrue(spyTodoService.saveWasCalled)
		assertEquals("todo1", spyTodoService.save_arg)

	}

}



