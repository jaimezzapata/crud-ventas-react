package co.com.zz.crudVentas.service;

import co.com.zz.crudVentas.model.ModelProducto;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

public interface InterfaceServiceProducto {

    List<ModelProducto> findAll();

    Optional<ModelProducto> findById(Integer idProducto);

    ModelProducto create(ModelProducto modelProducto);

    ModelProducto update(ModelProducto modelProducto);

    void delete(Integer idProducto);

}
