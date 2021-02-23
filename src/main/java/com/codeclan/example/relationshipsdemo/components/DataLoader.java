package com.codeclan.example.relationshipsdemo.components;

import com.codeclan.example.relationshipsdemo.models.File;
import com.codeclan.example.relationshipsdemo.models.Folder;
import com.codeclan.example.relationshipsdemo.models.User;
import com.codeclan.example.relationshipsdemo.repositories.FileRepository;
import com.codeclan.example.relationshipsdemo.repositories.FolderRepository;
import com.codeclan.example.relationshipsdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User bob = new User("Bob");
        userRepository.save(bob);
        User billy = new User("Billy");
        userRepository.save(billy);
        Folder folder1 = new Folder("Folder1", bob);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Folder2", billy);
        folderRepository.save(folder2);
        File file1 = new File("file1", ".jpg", 20, folder1);
        fileRepository.save(file1);
        File file2 = new File("file2", ".jpg", 30, folder2);
        fileRepository.save(file2);

    }
}
