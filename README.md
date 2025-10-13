# Injection_DP 
--------------------------------------------------------------------------------BY SAAD AAQIL -----------------------------------------------------------------------------------------

> Un petit framework Java démontrant l'injection de dépendances personnalisée en utilisant les principes de conception orientée objet.

  Objectif

Ce projet a pour but d’illustrer un système simple d’injection de dépendances, permettant de mieux comprendre le fonctionnement des frameworks comme Spring sans leur complexité.

 Fonctionnalités

- Injection automatique de dépendances
- Utilisation de la réflexion Java
- Architecture orientée design patterns
- Construction légère et facilement extensible

    Prérequis

- Java 11 ou plus
- Maven 3.x

    Installation

Clone le dépôt :

```bash
git clone https://github.com/senBenz/Injection_DP.git
cd Injection_DP
```


il exite plusieur methode D'injection des dependences , parmis ces methodes il y a le frameworke spring et a l aide de cette framework il y a une methode qui nous mene a ajouter les extensions d une application a l aide d'un fichier xml : 

--Exemple du fichier XML : 

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
           http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="serviceClient" class="com.example.ServiceClient">
        <property name="service" ref="serviceImpl"/>
    </bean>

    <bean id="serviceImpl" class="com.example.ServiceImpl"/>
</beans>


<img width="1237" height="811" alt="versiondb" src="https://github.com/user-attachments/assets/fc14f2bb-2efc-49e7-8b6d-47f8d3ae8549" />



















