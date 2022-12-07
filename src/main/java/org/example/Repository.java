package org.example;

import org.example.Entities.StudentEntity;

import javax.persistence.*;
import javax.transaction.Transactional;

public abstract class Repository {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void save(StudentEntity student) {
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
    }

    public static StudentEntity searchById(int id) {
        entityManager.find(StudentEntity.class, id);
        //        entityManager.getTransaction().begin();
//        TypedQuery<StudentEntity> query = entityManager.createQuery("SELECT s FROM StudentEntity s WHERE s.id=:id", StudentEntity.class);
//        Optional<StudentEntity> student = Optional.ofNullable(query.setParameter("id", id).getSingleResult());
//        System.out.printf(String.valueOf(student));
//        entityManager.getTransaction().commit();
        return entityManager.find(StudentEntity.class, id);
    }

    public static StudentEntity remove_(int id) {
        StudentEntity s = searchById(id);
        entityManager.getTransaction().begin();
        entityManager.remove(s);
        entityManager.getTransaction().commit();
        return s;
    }

    @Transactional
    public static void update(StudentEntity student) {
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.flush();
    }


}
