package fr.ensim.android.coursrecyclerview.service

import fr.ensim.android.coursrecyclerview.data.Town

class ServiceTown {
    companion object {
        val towns = listOf<Town>(
            Town(
                "Rennes",
                "rennes",
                217728,
                "Rennes est une commune de l\'Ouest de la France, chef-lieu du département d’Ille-et-Vilaine et de la région Bretagne. La ville se situe en Haute-Bretagne — partie orientale de la Bretagne — à la confluence de l’Ille et de la Vilaine. Ses habitants sont appelés les Rennais et les Rennaises."
            ),
            Town(
                "Le Mans",
                "lemans",
                143252,
                "Le Mans est une commune faisant partie des grandes villes du Grand Ouest français, située dans la région des Pays de la Loire et le département de la Sarthe dont elle est la préfecture.\nLa ville se trouve à la confluence des rivières de la Sarthe et de l\'Huisne. Ancienne capitale provinciale du Maine et du Perche à partir du XVIe siècle1, elle voit le mariage de Geoffroy V d\'Anjou et Mathilde l\'Emperesse, fille du roi d\'Angleterre, jetant ainsi les bases de l\'Empire Plantagenêt, et la naissance d\'Henri II."
            ),
            Town(
                "Nantes",
                "nantes",
                217728,
                "Nantes est une commune de l\'ouest de la France, située au sud du Massif armoricain, qui s\'étend sur les rives de la Loire, à 50 km de l\'océan Atlantique. Chef-lieu du département de la Loire-Atlantique, et préfecture de la région Pays de la Loire, elle est, en 2018, la sixième commune la plus peuplée de France avec ses 314 138 habitants, et la première de l\'Ouest en nombre d\'habitants."
            ),
            Town(
                "Brest",
                "brest",
                139602,
                "Brest est une commune française, chef-lieu d’arrondissement du département du Finistère dans la région Bretagne. C\'est un port important, deuxième port militaire en France après Toulon, situé à l\'extrémité ouest de la Bretagne.\n\nAvec ses 139 602 habitants (2018), Brest est la 25e commune la plus peuplée de France. Forte d\'une métropole de 210 047 habitants (2018)3, elle représente la première agglomération de l\'ouest breton et la seconde de la région Bretagne après Rennes. Bien que Brest, aussi appelée la cité du Ponant, soit la ville la plus peuplée du Finistère, la préfecture du département est Quimper."
            )
        )
    }
}