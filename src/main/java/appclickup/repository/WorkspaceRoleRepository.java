package appclickup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import appclickup.entity.WorkspaceRole;

import java.util.UUID;

public interface WorkspaceRoleRepository extends JpaRepository<WorkspaceRole, UUID> {
}
