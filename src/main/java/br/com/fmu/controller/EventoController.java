/*
 * package br.com.fmu.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import br.com.fmu.model.Evento; import br.com.fmu.service.EventoService;
 * 
 * @RestController
 * 
 * @RequestMapping("/evento") public class EventoController {
 * 
 * @Autowired private EventoService eventoService;
 * 
 * @GetMapping("/listar") public ResponseEntity<List<Evento>> findAll() {
 * List<Evento> lista = eventoService.findAll(); return new
 * ResponseEntity<List<Evento>>(lista, HttpStatus.OK); }
 * 
 * @GetMapping("/selecionar/{id}") public ResponseEntity<Evento>
 * findById(@PathVariable("id") int id) { Evento evento =
 * eventoService.findById(id); return new ResponseEntity<Evento>(evento,
 * HttpStatus.OK); }
 * 
 * @PostMapping("/inserir") public ResponseEntity<Evento> save(@RequestBody
 * Evento evento) { eventoService.save(evento); return new
 * ResponseEntity<Evento>(evento, HttpStatus.CREATED); }
 * 
 * @PutMapping("/atualizar") public ResponseEntity<Evento> update(@RequestBody
 * Evento evento) { eventoService.update(evento); return new
 * ResponseEntity<Evento>(evento, HttpStatus.OK); }
 * 
 * @DeleteMapping("/deletar/{id}") public ResponseEntity<Void>
 * deleteById(@PathVariable("id") int id) { eventoService.deleteById(id); return
 * new ResponseEntity<Void>(HttpStatus.NO_CONTENT); }
 * 
 * }
 */