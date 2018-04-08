package application.impl

import application.FournisseurApplication
import dagger.Component
import domain.model.fournisseur.Fournisseur
import domain.model.fournisseur.repository.FournisseurRepository
import javax.inject.Inject

class FournisseurApplicationImpl :  FournisseurApplication{
    @Inject
    lateinit var repository: FournisseurRepository

    override fun retrieveList(): List<Fournisseur> {
        val fournisseur = repository.retrieveList()
        return fournisseur
    }

    override fun retrieveById(idFournisseur : Int): Fournisseur {
        val fournisseur =  repository.retrieveById(idFournisseur).get()
        assertIsPresent(fournisseur)
        return fournisseur
    }

    fun assertIsPresent(fournisseur : Fournisseur){
        if(null == fournisseur){
            throw Exception("id doesn't match with any fournisseur")
        }
    }
}