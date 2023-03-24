import React from 'react';
import logo from './logo.svg';
import './App.css';
import {Route, Routes} from "react-router-dom";
import { Paths } from 'paths';
import TodoPage from "./TodoPage";
import {RecoilRoot} from "recoil";
import {NetworkTodoRepository} from "./TodoRepository";

function App() {
  const todoRepository = new NetworkTodoRepository()

  return (
      <TodoPage
        todoRepository={todoRepository}/>
      // <RecoilRoot>
      //     <Routes>
      //       <Route
      //         path={Paths.HOME}
      //         element={
      //           <TodoPage />
      //         }
      //         />
      //             <Route
      //                 path={"/home"}
      //                 element={
      //                     <TodoPage />
      //                 }
      //             />
      //     </Routes>
      // </RecoilRoot>
  );
}

export default App;
