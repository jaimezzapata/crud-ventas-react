package co.com.zz.crudVentas.respository;

import co.com.zz.crudVentas.model.ModelProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterfaceRepositoryProducto extends JpaRepository<ModelProducto, Integer> {
}
