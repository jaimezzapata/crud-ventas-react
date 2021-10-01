package co.com.zz.crudVentas.service;

import co.com.zz.crudVentas.model.ModelProducto;
import co.com.zz.crudVentas.respository.InterfaceRepositoryProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceProducto implements InterfaceServiceProducto {

    @Autowired
    private InterfaceRepositoryProducto productoRepository;

    @Override
    public List<ModelProducto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<ModelProducto> findById(Integer idProducto) {
        return productoRepository.findById(idProducto);
    }

    @Override
    public ModelProducto create(ModelProducto modelProducto) {
        return productoRepository.save(modelProducto);
    }

    @Override
    public ModelProducto update(ModelProducto modelProducto) {
        return productoRepository.save(modelProducto);
    }

    @Override
    public void delete(Integer idProducto) {
        productoRepository.deleteById(idProducto);
    }
}
