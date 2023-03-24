import Todo from "./Todo";

export interface TodoRepository {
    getTodos(): Promise<Todo[]>
}

export class NetworkTodoRepository implements TodoRepository {
    getTodos(): Promise<Todo[]> {
        return Promise.resolve([])
    }

}