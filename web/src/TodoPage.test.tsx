import React from 'react';
import { act, render, screen } from '@testing-library/react';
import {TestIds} from "./tests/TestIds";
import TodoPage   from './TodoPage';
import {SpyStubTodoRepository} from "./SpyStubTodoRepository";

describe('/', () => {
    const spyStubTodoRepository = new SpyStubTodoRepository()
    beforeEach(async () => {
        await act(async () => {
            await render(<TodoPage
                todoRepository={spyStubTodoRepository}/>);
        })
    })
    it('input要素が表示される',  () => {
        //THEN
        expect(screen.getByRole('textbox')).toBeInTheDocument()
    })

    it('登録ボタンが表示される',  () => {
        //THEN
        expect(screen.getByRole('button', { name: '登録'})).toBeInTheDocument()
    })

    it('todoListが表示される', async () => {
        //THEN
        expect(screen.getByTestId(TestIds.TODO_LIST))
    })

    it('リポジトリのgetTodoを呼ぶ', () => {
        //THEN
        expect(spyStubTodoRepository.getTodoWasCalled).toBeTruthy()
        expect(screen.getByText('todo1')).toBeInTheDocument()
        expect(screen.getByText('todo2')).toBeInTheDocument()
    })
})


