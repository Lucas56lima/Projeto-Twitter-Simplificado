package controllers.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
