package lesson1.dao;


import org.springframework.stereotype.Component;

@Component
public class SimpleDAOImpl implements SimpleDAO {

    @Override
    public String getData() {
        return "Hello ";
    }
}
