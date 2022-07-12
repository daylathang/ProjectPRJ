package com.project;

import com.project.model.Role;
import com.project.repository.RoleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void testAddRole() {
        Role role = new Role();
        role.setId(3);
        role.setName("test");

        Role saveRole = roleRepository.save(role);

        assertThat(saveRole).isNotNull();
        assertThat(saveRole.getId() > 0);

    }

    @Test
    public void testListAll() {
        Iterable<Role> roles = roleRepository.findAll();
        assertThat(roles).hasSizeGreaterThan(0);

        for (Role role : roles) {
            System.out.println(role);
        }
    }
}
