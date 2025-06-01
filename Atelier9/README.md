# 📱 App_Save1 – Atelier 9 : Gestion de la persistance avec SQLite

Ce projet est une application Android développée en **Java**, visant à illustrer la gestion de la persistance locale à l’aide de **SQLite**.

---

## 🎯 Objectif

Créer une application qui permet de :
- Ajouter une **formation** (titre, type)
- Afficher toutes les formations
- Modifier une formation existante par ID
- Supprimer une formation existante par ID

---

## 🧱 Structure de la base de données

- **Nom de la base :** `formation.db`
- **Table :** `formation`
- **Colonnes :**
  - `id` (INTEGER PRIMARY KEY AUTOINCREMENT)
  - `titre` (TEXT)
  - `type` (TEXT)

---

## 🖼️ Interface utilisateur

L’interface propose les éléments suivants :

- `EditText` pour saisir le titre, le type et l'ID (nécessaire pour la mise à jour ou suppression)
- `Button` pour chaque action : Ajouter, Afficher, Modifier, Supprimer
- `TextView` pour afficher la liste des formations

---

## 📁 Fichiers principaux

### ✅ activity_main.xml

Contient l'interface avec les champs de saisie, les boutons, et la zone d'affichage des résultats.

### ✅ DatabaseHelper.java

Contient la logique de création et de manipulation de la base de données SQLite :
- `onCreate()` : création de la table
- `insertFormation()` : insertion
- `getAllFormations()` : sélection
- `updateFormation()` : mise à jour
- `deleteFormation()` : suppression

### ✅ MainActivity.java

Gère les actions utilisateurs :
- Récupère les données depuis les champs
- Appelle les méthodes correspondantes dans `DatabaseHelper`
- Affiche un message `Toast` pour informer de la réussite ou de l’échec

---

## ✅ Validation utilisateur

Avant de modifier ou supprimer, l’application vérifie que l’**ID** a bien été saisi. Si ce n’est pas le cas, un message d’erreur est affiché, évitant ainsi un crash.

---

## 🚀 Exécution

### Pré-requis
- Android Studio installé
- Un émulateur ou appareil Android API 21+

### Étapes
1. Cloner ou importer le projet dans Android Studio
2. Lancer l’émulateur ou brancher un appareil réel
3. Lancer l’application (`Run > Run 'app'`)
4. Tester les fonctionnalités CRUD depuis l’interface

---

## ✍️ Auteur

Développé dans le cadre de l’**Atelier 9 – SQLite** en Java Android.

---

## 📌 Remarques

- Aucune bibliothèque externe n’est utilisée
- Le projet est 100% natif et minimaliste
- Peut servir de base pour d’autres entités : `client`, `produit`, etc.

