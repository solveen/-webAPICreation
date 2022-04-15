package StudentRepository;

import Model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface UserRepositories extends JpaRepository<StudentModel, Integer> {
    }


