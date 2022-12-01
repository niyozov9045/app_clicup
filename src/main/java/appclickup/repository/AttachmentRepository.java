package appclickup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import appclickup.entity.Attachment;

import java.util.UUID;

public interface AttachmentRepository extends JpaRepository<Attachment, UUID> {
}
