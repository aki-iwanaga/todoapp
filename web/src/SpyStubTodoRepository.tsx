import {TodoRepository} from "./TodoRepository";
import Todo from "./Todo";

export class SpyStubTodoRepository implements TodoRepository {
    getTodoWasCalled
    constructor() {
        this.getTodoWasCalled = false
    }
    getTodos():Promise<Todo[]> {
        this.getTodoWasCalled = true
        return Promise.resolve([{todo:'todo1'},{todo:'todo2'}])
    }
}