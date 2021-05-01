package led.rest.repository

import led.rest.entity.Mode
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ModeRepository : JpaRepository<Mode, Int>