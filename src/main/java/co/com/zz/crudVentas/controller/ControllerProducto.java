package co.com.zz.crudVentas.controller;

import co.com.zz.crudVentas.model.ModelProducto;
import co.com.zz.crudVentas.service.ServiceProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ControllerProducto {

    @Autowired
    private ServiceProducto serviceProducto;

    @GetMapping
    public ResponseEntity<List<ModelProducto>> findAll() {
        return ResponseEntity.ok(serviceProducto.findAll());
    }

    @GetMapping("/{idProducto}")
    public ResponseEntity<ModelProducto> findById(@PathVariable("idProducto") Integer idProducto) {
        return serviceProducto.findById(idProducto)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ModelProducto> create(@RequestBody ModelProducto modelProducto) {
        return new ResponseEntity<>(serviceProducto.create(modelProducto), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<ModelProducto> update(@RequestBody ModelProducto modelProducto) {
        return serviceProducto.findById(modelProducto.getIdProducto())
                .map(clienteEncontrado -> ResponseEntity.ok(serviceProducto.update(modelProducto)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
