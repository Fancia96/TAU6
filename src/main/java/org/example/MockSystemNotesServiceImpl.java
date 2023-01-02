package org.example;

import java.util.List;

public class MockSystemNotesServiceImpl implements NotesStorage {

    private List<Note> noteList;

    @Override
    public void add(Note note) {
        this.noteList.add(note);
    }

    @Override
    public List<Note> getAllNotesOf(String name) {
        return noteList;
    }

    @Override
    public void clear() {

    }
}
