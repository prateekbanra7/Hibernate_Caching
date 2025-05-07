package in.abc.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.abc.Model.InsurancePolicy;
import in.abc.util.HibernateUtil;

public class FirstLevelCacheTest1 {

	public static void main(String[] args) {

		Session session = null;
		boolean flag = false;
		Transaction transaction = null;
		InsurancePolicy policy = null;

		session = HibernateUtil.getSession();

		try {
			policy = session.get(InsurancePolicy.class, 1L);

			if (policy == null) {
				System.out.println("Record not found...");
			} else {
				System.out.println("Record found and displayed...");
				System.out.println(policy);
				transaction = session.beginTransaction();
				policy.setTenure(9);
				session.update(policy);

				policy.setTenure(30);
				session.update(policy);

				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("Object updated...");
			} else {
				transaction.rollback();
				System.out.println("Object not updated...");
			}
			HibernateUtil.closeSession(session);
		}
	}
}
