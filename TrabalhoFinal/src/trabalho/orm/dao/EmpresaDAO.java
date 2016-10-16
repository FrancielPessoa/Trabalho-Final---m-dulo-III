package trabalho.orm.dao;

import java.util.List;
import javax.persistence.EntityManager;
import trabalho.orm.model.Empresa;
import trabalho.orm.util.JPAUtil;

public class EmpresaDAO {

    private EntityManager em = JPAUtil.ConnectionFactory().createEntityManager();

    public void insert(Empresa e) {
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();

    }

    public Empresa select(String cnpj) {

        return em.createNamedQuery("Empresa.buscaPorCnpj", Empresa.class)
                .setParameter("cnpj", cnpj)
                .getSingleResult();
    }

    public List<Empresa> select() {
        return em.createNamedQuery("Empresa.buscaTodas", Empresa.class)
                .getResultList();
    }

    public void update(Empresa e) {
        em.getTransaction().begin();
        em.merge(e);
        em.getTransaction().commit();

    }

    public void delete(Empresa e) {
        em.getTransaction().begin();
        em.remove(e);
        em.getTransaction().commit();

    }

    public void close() {
        if (em.isOpen()) {
            em.close();
        }
        if (JPAUtil.ConnectionFactory().isOpen()) {
            JPAUtil.ConnectionFactory().close();
        }
    }

}
