package application.impl

import application.AgenceApplication
import dagger.Component
import domainmodel.model.agence.Agence
import domainmodel.model.agence.repository.AgenceRepository
import javax.inject.Inject

@Component
class AgenceApplicationImpl : AgenceApplication{
    @Inject
    lateinit var repository: AgenceRepository

    override fun retrieveList(): List<Agence> {
        val agences = repository.retrieveList()
        return agences
    }

    override fun retrieveById(idAgence : Int): Agence {
        val agence =  repository.retrieveById(idAgence).get()
        assertIsPresent(agence)
        return agence
    }

    fun assertIsPresent(agence : Agence){
        if(null == agence){
            throw Exception("id doesn't match with any agence")
        }
    }
}