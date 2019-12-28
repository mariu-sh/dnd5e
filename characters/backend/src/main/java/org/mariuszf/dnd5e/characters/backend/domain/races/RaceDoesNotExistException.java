package org.mariuszf.dnd5e.characters.backend.domain.races;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Requested race does not exist")
public class RaceDoesNotExistException extends RuntimeException {
}
