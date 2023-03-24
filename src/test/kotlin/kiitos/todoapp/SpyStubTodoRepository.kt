package kiitos.todoapp

import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.repository.query.FluentQuery
import java.util.*
import java.util.function.Function

class SpyStubTodoRepository : TodoRepository {
    var saveWasCalled = false
    var findAllWasCalled = false
    var saveAllArgument: MutableIterable<TodoRecord?>? = null
    var saveAllLastCalled: Boolean = false
    override fun <S : TodoRecord?> saveAll(entities: MutableIterable<S>): MutableList<S> {
        saveAllArgument = entities
        saveAllLastCalled = true
        return mutableListOf()
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }

    var saveArgument: TodoRecord? = null
    override fun <S : TodoRecord> save(entity: S): S {
        saveWasCalled = true
        saveArgument = entity
        return entity
    }

    override fun findById(id: String): Optional<TodoRecord> {
        TODO("Not yet implemented")
    }

    override fun existsById(id: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun findAll(): MutableList<TodoRecord> {
        findAllWasCalled = true
        return mutableListOf(
            TodoRecord(1, "todo1"),
            TodoRecord(2, "todo2")
        )
    }

    override fun findAll(sort: Sort): MutableList<TodoRecord> {
        TODO("Not yet implemented")
    }

    override fun <S : TodoRecord?> findAll(example: Example<S>): MutableList<S> {
        TODO("Not yet implemented")
    }

    override fun <S : TodoRecord?> findAll(example: Example<S>, sort: Sort): MutableList<S> {
        TODO("Not yet implemented")
    }

    override fun findAll(pageable: Pageable): Page<TodoRecord> {
        TODO("Not yet implemented")
    }

    override fun <S : TodoRecord?> findAll(example: Example<S>, pageable: Pageable): Page<S> {
        TODO("Not yet implemented")
    }

//    override fun findAll(spec: Specification<TodoRecord>?): MutableList<TodoRecord> {
//        TODO("Not yet implemented")
//    }
//
//    override fun findAll(spec: Specification<TodoRecord>?, pageable: Pageable): Page<TodoRecord> {
//        TODO("Not yet implemented")
//    }
//
//    override fun findAll(spec: Specification<TodoRecord>?, sort: Sort): MutableList<TodoRecord> {
//        TODO("Not yet implemented")
//    }

    override fun findAllById(ids: MutableIterable<String>): MutableList<TodoRecord> {
        TODO("Not yet implemented")
    }

    override fun count(): Long {
        TODO("Not yet implemented")
    }

    override fun <S : TodoRecord?> count(example: Example<S>): Long {
        TODO("Not yet implemented")
    }

//    override fun count(spec: Specification<TodoRecord>?): Long {
//        TODO("Not yet implemented")
//    }

    override fun deleteById(id: String) {
        TODO("Not yet implemented")
    }

    override fun delete(entity: TodoRecord) {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: MutableIterable<String>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: MutableIterable<TodoRecord>) {
        TODO("Not yet implemented")
    }

    override fun <S : TodoRecord?> findOne(example: Example<S>): Optional<S> {
        TODO("Not yet implemented")
    }

//    override fun findOne(spec: Specification<TodoRecord>?): Optional<TodoRecord> {
//        TODO("Not yet implemented")
//    }

    override fun <S : TodoRecord?> exists(example: Example<S>): Boolean {
        TODO("Not yet implemented")
    }

    override fun <S : TodoRecord?, R : Any> findBy(
        example: Example<S>,
        queryFunction: Function<FluentQuery.FetchableFluentQuery<S>, R>
    ): R {
        TODO("Not yet implemented")
    }

    override fun flush() {
        TODO("Not yet implemented")
    }

    override fun <S : TodoRecord> saveAndFlush(entity: S): S {
        TODO("Not yet implemented")
    }

    override fun <S : TodoRecord?> saveAllAndFlush(entities: MutableIterable<S>): MutableList<S> {
        TODO("Not yet implemented")
    }

    override fun deleteAllInBatch(entities: MutableIterable<TodoRecord>) {
        TODO("Not yet implemented")
    }

    override fun deleteAllInBatch() {
        TODO("Not yet implemented")
    }

    override fun deleteAllByIdInBatch(ids: MutableIterable<String>) {
        TODO("Not yet implemented")
    }

    override fun getOne(id: String): TodoRecord {
        TODO("Not yet implemented")
    }

    override fun getById(id: String): TodoRecord {
        TODO("Not yet implemented")
    }

    override fun getReferenceById(id: String): TodoRecord {
        TODO("Not yet implemented")
    }

}