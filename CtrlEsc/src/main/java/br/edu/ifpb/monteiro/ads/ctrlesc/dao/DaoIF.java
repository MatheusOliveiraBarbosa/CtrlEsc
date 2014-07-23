package br.edu.ifpb.monteiro.ads.ctrlesc.dao;

import java.util.List;

/**
 *
 * @author MarkusPatriota
 * @param <T>
 */
public interface DaoIF<T> {
    
    public void create(T entity);
    
    public void edit(T entity);
    
    public void remove(T entity);
            
    public T find(Object id);
    
    public List<T> findAll();;
    
    public List<T> findRange(int[] range);
    
    public int count();
            
}
