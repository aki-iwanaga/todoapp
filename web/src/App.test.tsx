import React from 'react';
import { render, screen } from '@testing-library/react';
import App from './App';
import {renderApplication} from "./tests/RenderApplication";
import {TestIds} from "./tests/TestIds";

it('/にアクセスするとTodoPageが表示される', async () => {
  await renderApplication('/');

  expect(
      screen.getByTestId(TestIds.TODO_PAGE)
  ).toBeInTheDocument();
});