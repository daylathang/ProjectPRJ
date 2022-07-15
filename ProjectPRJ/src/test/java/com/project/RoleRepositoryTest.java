package com.project;

import com.project.model.Department;
import com.project.model.Role;
import com.project.model.Subject;
import com.project.repository.DepartmentRepository;
import com.project.repository.RoleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;
    private DepartmentRepository department;

    @Test
    public void testAddRole() {
        Role role = new Role();
        Role saveRole = roleRepository.save(role);
        assertThat(saveRole).isNotNull();
        assertThat(saveRole.getId() > 0);

    }
    @Test
    public void deleteRole(){
        int id = 3;
        roleRepository.deleteById(id);
        Optional<Role> roleOptional = roleRepository.findById(id);
        assertThat(roleOptional).isNotPresent();
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
