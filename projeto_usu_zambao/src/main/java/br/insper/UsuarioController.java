package br.insper;

public class UsuarioController {
    private UsuarioService;
}

@GetMapping("/teste")
publiv String teste(){
    return "TESTE";
}

@GetMapping
public List<Usuario> getUsuarios(){
    return usuarioService.getUsuarios();
}
