package domainmodel.model.client

import domainmodel.model.projet.Projet

data class Client constructor(
        var prenom : String,
        var nom : String,
        var email : String,
        var adresse : String,
        var ville : String,
        var pays : String,
        var telephone : String,
        var photo : String,
        var civilite : String,
        var projets : List<Projet>
)