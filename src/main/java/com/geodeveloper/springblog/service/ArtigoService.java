package com.geodeveloper.springblog.service;

import com.geodeveloper.springblog.model.Artigo;

import java.util.List;

public interface ArtigoService {

    public List<Artigo> obterTodos();
    public Artigo obterPorCodigo(String codigo);
    public Artigo criar(Artigo artigo);
}
