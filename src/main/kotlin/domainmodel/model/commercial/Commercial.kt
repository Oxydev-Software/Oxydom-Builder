package domainmodel.model.commercial

import domainmodel.model.agence.Agence
import domainmodel.model.projet.Projet

data class Commercial(
        var prenom : String,
        var nom : String,
        var email : String,
        var codeCommercial : String,
        var telephone : String,
        var motDePasse : String,
        var pourcentageCommission : Float,
        var agence : Agence,
        var projets : List<Projet>
) {
}