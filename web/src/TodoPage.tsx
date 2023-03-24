import React, {useEffect, useState} from "react";
import {TestIds} from "./tests/TestIds";
import {TodoRepository} from "./TodoRepository";
import Todo from "./Todo";
import {useAsync} from "react-use";

type Props = {
    todoRepository: TodoRepository
}

export default function TodoPage({
    todoRepository
 }: Props){

    const [todos, setTodos] = useState<Todo[]>([])

    // const aaa = useAsync(() => todoRepository.getTodos())
    // setTodos(aaa)
    useAsync( async()=>{
        const res = await todoRepository.getTodos()
        console.log("res",res)
        // elem = res.map(obj => (
        //     <p>{obj.todo}</p>
        // ))
        setTodos([{todo:"aaa"}])
        },[])


    return (
        <div data-testid={TestIds.TODO_PAGE}>
            <input></input>
            <button>登録</button>
            <div data-testid={TestIds.TODO_LIST}>
                <p>{todos}</p>
            </div>
        </div>
    )
}