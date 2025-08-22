# Assurance des voitures

##  Description
**Assurance** est une application développée en **Java** avec **NetBeans** (Ant), destinée à la gestion complète des opérations liées aux assurances.  
Elle permet d’administrer des données essentielles telles que les contrats, les clients et les sinistres via une interface simple et extensible.

## Fonctionnalités principales
- **Gestion des clients** : ajouter, modifier, supprimer et consulter les informations des assurés.
- **Gestion des contrats** : créer et suivre les contrats d’assurance.
- **Gestion des sinistres** : enregistrer et traiter les sinistres liés aux contrats.
- **Navigation multi-modules** pour une expérience utilisateur fluide.
- **Opérations CRUD** (Créer, Lire, Mettre à jour, Supprimer) pour toutes les entités.
- **Rapports et exports** des données pour suivi et archivage.
- **Validation des données** et gestion des erreurs pour une meilleure fiabilité.

## Architecture & Technologies
- **Langage** : Java  
- **IDE** : NetBeans  
- **Build** : Ant (`build.xml`)  
- **Structure** :
  - `src/assurance` → code source
  - `nbproject/`, `manifest.mf` → configuration et métadonnées
  - `build.xml` → script de build Ant

## Installation
1. Clonez ou téléchargez le projet :
    ```bash
    git clone https://github.com/khayatti1/Assurance.git
    ```
2. Ouvrez le projet avec **NetBeans**.
3. Exécutez l’action **Clean & Build**.
4. Lancez l’application via **Run** dans NetBeans.

## Utilisation
- Lancez l’application depuis NetBeans.
- Naviguez entre les modules (Clients, Contrats, Sinistres).
- Effectuez des opérations CRUD sur les différentes entités.
- Exportez ou affichez les rapports pour analyse et suivi.
