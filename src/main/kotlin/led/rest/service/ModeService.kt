package led.rest.service

import led.rest.entity.Mode
import led.rest.repository.ModeRepository
import org.springframework.stereotype.Service

@Service
class ModeService(private val modeRepository: ModeRepository) {

    fun findAllModes(): List<Mode?> {
        return modeRepository.findAll()
    }
}