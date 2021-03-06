package portadapter.persistence.mapper

import dagger.Component
import org.apache.ibatis.annotations.Param
import portadapter.persistence.entity.ECategorie
import portadapter.persistence.entity.EGamme
import java.util.*
@Component
interface GammeMapper {
    fun retrieveById(@Param("id") idGamme : Int) : Optional<EGamme>
    fun retrieveList() : List<ECategorie>
    fun create(@Param("gamme") eGamme: EGamme) : Int
    fun update(@Param("gamme") eGamme: EGamme) : Int
}