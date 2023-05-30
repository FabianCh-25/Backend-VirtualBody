package com.g6.virtualbody.services;

import com.g6.virtualbody.entities.Curso;


import java.util.List;

public interface ICursoService {
        public void insert(Curso curso);
        List<Curso> LIST();

        public void delete(int idCurso);

        public Curso listId(int idCurso);
}