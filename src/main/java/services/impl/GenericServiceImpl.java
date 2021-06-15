package services.impl;

import models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import services.GenericService;

import java.util.List;

public class GenericServiceImpl<T> implements GenericService<T> {

    private JpaRepository<T, Long> repository;

    public GenericServiceImpl(JpaRepository<T, Long> repository) {
    }

    @Override
    public List<T> findall() {
        return this.repository.findAll();
    }

    @Override
    public T findById(Long id) {
        return this.repository.findById(id).get();
    }

    @Override
    public T save(T entity) {
        return this.repository.save(entity);
    }

    @Override
    public T update(T entity) {
        return this.repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}
