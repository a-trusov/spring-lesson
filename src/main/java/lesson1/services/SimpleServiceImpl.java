package lesson1.services;

import lesson1.dao.SimpleDAO;

public class SimpleServiceImpl implements SimpleService {

    private SimpleDAO dao;

    public SimpleServiceImpl(SimpleDAO dao) {
        this.dao = dao;
    }

    @Override
    public String getTestService() {

        String tmp = dao.getData() +  "| Service";
        return tmp;
    }
}
