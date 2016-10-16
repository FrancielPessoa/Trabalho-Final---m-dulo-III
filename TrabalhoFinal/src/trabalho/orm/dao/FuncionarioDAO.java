package trabalho.orm.dao;

import trabalho.orm.model.Empresa;
import trabalho.orm.model.Funcionario;
import trabalho.orm.util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;

public class FuncionarioDAO {
    
    private EntityManager em = JPAUtil.ConnectionFactory().createEntityManager();

    public void insert(Funcionario f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();

    }

    public Funcionario select(String matricula) {

        return em.createNamedQuery("Funcionario.buscaPorMatricula", Funcionario.class)
                .setParameter("matricula", matricula)
                .getSingleResult();
    }

    public List<Funcionario> select() {
        return em.createNamedQuery("Funcionario.buscaTodos", Funcionario.class)
                .getResultList();
    }

    public void update(Funcionario f) {
        em.getTransaction().begin();
        em.merge(f);
        em.getTransaction().commit();

    }

    public void delete(Funcionario f) {
        em.getTransaction().begin();
        em.remove(f);
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
