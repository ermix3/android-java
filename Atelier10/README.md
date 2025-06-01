# 📱 App_Save2 – Atelier 10 : Gestion de la persistance (Liste des Clients)

Ce projet Android permet de gérer une base de données locale SQLite contenant une **liste de clients**. Il a été réalisé dans le cadre de l'**Atelier 10** portant sur la persistance des données avec SQLite.

---

## 🎯 Objectif pédagogique

Apprendre à :
- Créer une base de données locale SQLite dans une application Android
- Gérer une table `client` avec les opérations CRUD (Create, Read, Update, Delete)
- Utiliser Java et Android Studio pour développer une interface simple

---

## 🧱 Structure de la base de données

- **Nom de la base :** `gestion.db`
- **Table :** `client`
- **Champs :**
    - `id` – Identifiant auto-incrémenté (clé primaire)
    - `nom` – Nom du client (texte)

---

## 🖼️ Interface utilisateur

L'interface graphique est conçue avec `activity_main.xml` et permet :
- La saisie du **nom** du client
- La saisie de l'**ID** (pour modifier ou supprimer)
- L'utilisation de 4 boutons :
    - **Ajouter** un client
    - **Afficher** tous les clients
    - **Modifier** un client existant par son ID
    - **Supprimer** un client par son ID
- Un `TextView` affiche la liste des clients

---

## 📁 Fichiers principaux

### ✅ DatabaseHelper.java

- Crée la base de données et la table `client`
- Méthodes :
    - `insertClient(String nom)`
    - `getAllClients()`
    - `updateClient(int id, String nom)`
    - `deleteClient(int id)`

### ✅ MainActivity.java

- Initialise les composants de l’interface
- Gère les interactions utilisateur (onClick)
- Affiche des `Toast` pour chaque opération réussie ou échouée
- Affiche la liste des clients dans un `TextView`

---

## ⚠️ Validation utilisateur

- Avant de modifier ou supprimer, l’ID est vérifié pour éviter les crashs (`try/catch` ou `isEmpty`)
- Un message est affiché si le champ ID est vide

---

## 🔧 Installation et exécution

### Prérequis

- Android Studio installé
- Un appareil Android ou un émulateur
- Java (Android API 21 minimum recommandé)

### Étapes

1. Cloner ou importer le projet dans Android Studio
2. Ouvrir `MainActivity.java`
3. Lancer l’application sur un émulateur ou un appareil
4. Tester les fonctionnalités CRUD via l’interface

---

## ✍️ Auteur

Développé dans le cadre de l'**Atelier 10 : gestion de la persistance en Java Android avec SQLite**.

---

## 📌 Remarques

- Ce projet peut être facilement adapté pour gérer d'autres entités (produits, utilisateurs, etc.)
- Il n'utilise **aucune bibliothèque externe** – tout est natif

---

## 🏁 Fonctionnalités couvertes

- ✅ Insertion (Ajout de client)
- ✅ Lecture (Liste complète)
- ✅ Mise à jour (Modification par ID)
- ✅ Suppression (Suppression par ID)

