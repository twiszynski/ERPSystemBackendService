package pl.twisz.BackendJFX.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.twisz.BackendJFX.entity.Operator;
import pl.twisz.BackendJFX.entity.QuantityType;
import pl.twisz.BackendJFX.repository.QuantityTypeRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class QuantityTypeController {
    private final QuantityTypeRepository quantityTypeRepository;

    @PostMapping("/quantity_types")
    public QuantityType newQuantityType(@RequestBody QuantityType newQuantityType) {
        return quantityTypeRepository.save(newQuantityType);
    }

    @GetMapping("/quantity_types")
    public List<QuantityType> listQuantityTypes() {
        return quantityTypeRepository.findAll();
    }

    @DeleteMapping("/quantity_types")
    public ResponseEntity deleteQuantityType(@RequestBody Long idQuantityType) {
        quantityTypeRepository.deleteById(idQuantityType);
        return ResponseEntity.ok().build();
    }
}
