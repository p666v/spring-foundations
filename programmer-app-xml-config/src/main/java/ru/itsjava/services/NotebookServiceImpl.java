package ru.itsjava.services;

import ru.itsjava.domain.Notebook;

public class NotebookServiceImpl implements NotebookService{
    @Override
    public Notebook getNotebook() {
        return new Notebook("Apple", "Macbook", 2025);
    }
}
