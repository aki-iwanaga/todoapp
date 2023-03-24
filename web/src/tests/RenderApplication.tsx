import { act } from 'react-dom/test-utils';
import { render } from '@testing-library/react';
import { BrowserRouter, MemoryRouter } from 'react-router-dom';
import React from "react";
import App from 'App';

export async function renderApplication(url: string) {
    await act(async () => {
        render(
            <MemoryRouter initialEntries ={[url]}>
                <App />
            </MemoryRouter>,
        // {
        //     wrapper: ({ children }) => (
        //         <>
        //             {children}
        //         <div id="popup-background" />
        //     </>
        // )
        // }
    )
    });
}

export async function renderApplicationInBrowserRouter() {
    await act(async () => {
        render(
            <BrowserRouter>
                <App />
            </BrowserRouter>,
        // {
        //     wrapper: ({ children }) => (
        //         <>
        //             {children}
        //         <div id="popup-background" />
        //     </>
        // ),
        // }
    );
    });
}
