package appclickup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import appclickup.entity.WorkspacePermission;

import java.util.UUID;

public interface WorkspacePermissionRepository extends JpaRepository<WorkspacePermission, UUID> {
}
