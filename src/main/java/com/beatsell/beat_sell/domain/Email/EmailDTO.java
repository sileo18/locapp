package com.beatsell.beat_sell.domain.Email;

import com.beatsell.beat_sell.domain.Usuario.Usuario;
import jakarta.validation.constraints.NotNull;

public record EmailDTO(@NotNull (message = "Email não deve ser nulo") String enderecoemail, Usuario usuario) {
}
