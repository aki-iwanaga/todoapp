package kiitos.todoapp

import jakarta.persistence.*

@Entity
@Table(name = "todos")
data class TodoRecord (
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long = 0,
    var todo : String = ""
)