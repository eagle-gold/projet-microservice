# 🌍 Projet Microservices – Planification de Voyage

Projet réalisé dans le cadre du Master 2 MIAGE-IF (Bases de données polyglottes et microservices).

## 🚀 Objectif

Ce projet a pour but de concevoir une application basée sur une architecture de microservices permettant de gérer des **points d’intérêt touristiques**. L’objectif final est de planifier un voyage en sélectionnant :

- une **ville**,
- des **activités**,
- des **hébergements**

## 🧱 Architecture

Le projet repose sur une architecture composée des services suivants :

| Microservice         | Fonction                                         | Port par défaut |
|----------------------|--------------------------------------------------|-----------------|
| `city-service`       | Gestion des villes                               | 8081            |
| `accommodation-service` | Gestion des hébergements                     | 8082            |
| `activity-service`   | Gestion des activités                            | 8083            |
| `trip-service`       | Planification du voyage                          | 8084            |
| `gateway-service`    | Point d'entrée unique pour tous les services     | 8080            |

Chaque service est exposé via des API REST.

## 🛠️ Technologies

- **Spring Boot**
- **Docker**
- **Kubernetes (Minikube)**
- **MongoDB** (pour `activity-service`)
- **PostgreSQL** (pour `accommodation-service`)
- **Postman** (pour les tests d'API)


