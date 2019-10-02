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
 * import br.com.fmu.model.Noticia; import br.com.fmu.service.NoticiaService;
 * 
 * @RestController
 * 
 * @RequestMapping("/noticia") public class NoticiaController {
 * 
 * @Autowired private NoticiaService noticiaService;
 * 
 * @GetMapping("/listar") public ResponseEntity<List<Noticia>> findAll() {
 * List<Noticia> lista = noticiaService.findAll(); return new
 * ResponseEntity<List<Noticia>>(lista, HttpStatus.OK); }
 * 
 * @GetMapping("/selecionar/{id}") public ResponseEntity<Noticia>
 * findById(@PathVariable("id") int id) { Noticia noticia =
 * noticiaService.findById(id); return new ResponseEntity<Noticia>(noticia,
 * HttpStatus.OK); }
 * 
 * @PostMapping("/inserir") public ResponseEntity<Noticia> save(@RequestBody
 * Noticia noticia) { noticiaService.save(noticia); return new
 * ResponseEntity<Noticia>(noticia, HttpStatus.CREATED); }
 * 
 * @PutMapping("/atualizar") public ResponseEntity<Noticia> update(@RequestBody
 * Noticia noticia) { noticiaService.update(noticia); return new
 * ResponseEntity<Noticia>(noticia, HttpStatus.OK); }
 * 
 * @DeleteMapping("/deletar/{id}") public ResponseEntity<Void>
 * deleteById(@PathVariable("id") int id) { noticiaService.deleteById(id);
 * return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); }
 * 
 * }
 */