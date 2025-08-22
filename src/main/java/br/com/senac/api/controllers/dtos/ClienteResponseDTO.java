package br.com.senac.api.controllers.dtos;

public class ClienteResponseDTO extends ClienteRequestDTO {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
