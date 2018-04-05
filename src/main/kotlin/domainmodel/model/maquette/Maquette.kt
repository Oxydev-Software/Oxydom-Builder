package domainmodel.model.maquette

import domainmodel.model.instancedemodule.InstanceDeModule
import domainmodel.model.projet.Projet
import domainmodel.model.tva.Tva
import java.time.ZonedDateTime

data class Maquette (
        var libelleMaquette : String,
        var codeMaquette : String,
        var numeroDevis : String,
        var dateCreationDevis : ZonedDateTime,
        var dateLimiteValidite : ZonedDateTime,
        var dureeTravauxEstimee : Int,
        var commentaire : String,
        var status : String,
        var instanceDeModules: List<InstanceDeModule>,
        var tva : Tva,
        var projet : Projet
){
}