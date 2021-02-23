package com.codeclan.example.relationshipsdemo.repositories;

import com.codeclan.example.relationshipsdemo.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FolderRepository extends JpaRepository<Folder, Long> {
}
